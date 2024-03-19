package com.electify.services.impl;

import com.electify.exceptions.customs.ModularException;
import com.electify.models.dto.auth.AuthUser;
import com.electify.models.dto.auth.Connection;
import com.electify.models.dto.auth.Registration;
import com.electify.models.dto.response.UserResponse;
import com.electify.models.entities.User;
import com.electify.repositories.UserRepository;
import com.electify.security.jwt.JwtService;
import com.electify.security.persistence.AuthMapper;
import com.electify.services.spec.IAuthenticationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
@Slf4j
public class AuthenticationService implements IAuthenticationService {
    private final JwtService jwtService;
    private final AuthMapper authMapper;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationProvider authenticationProvider;

    @Override
    public UserResponse register(Registration registration) {
        try {
            User userToCreate = authMapper.toEntity(registration);
            userToCreate.setPassword(passwordEncoder.encode(registration.getPassword()));

            return authMapper.toResponse(userRepository.save(userToCreate));
        } catch (DataIntegrityViolationException e) {
            throw new ModularException("Violated unique constraint (cin code or email address)", HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public String login(Connection connection) {
        var user = authenticationProvider.authenticate(new UsernamePasswordAuthenticationToken(connection.getEmail(), connection.getPassword()));
        var userDetails = (AuthUser) user.getPrincipal();
        var fullName = userDetails.getUser().getFirstName() + " " + userDetails.getUser().getLastName();
        return jwtService.generateToken(userDetails, Map.of("name", fullName));
    }
}
