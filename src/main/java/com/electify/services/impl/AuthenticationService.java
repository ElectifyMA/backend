package com.electify.services.impl;

import com.electify.exceptions.customs.ModularException;
import com.electify.mappers.auth.*;
import com.electify.models.dto.auth.AuthUser;
import com.electify.models.dto.auth.Connection;
import com.electify.models.dto.auth.Registration;
import com.electify.models.dto.response.UserResponse;
import com.electify.models.entities.*;
import com.electify.models.enums.Role;
import com.electify.repositories.*;
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
    private final PasswordEncoder passwordEncoder;

    private final UserRepository userRepository;
    private final AdminRepository adminRepository;
    private final VoterRepository voterRepository;
    private final CandidateRepository candidateRepository;
    private final SuperAdminRepository superAdminRepository;
    private final AuthenticationProvider authenticationProvider;
    private final PartyAdvisorRepository partyAdvisorRepository;
    private final PartyPresidentRepository partyPresidentRepository;
    private final InteriorMinistryAdminRepository interiorMinistryAdminRepository;
    private final GuestRepository guestRepository;

    private final UserMapper userMapper;
    private final AuthMapper authMapper;
    private final AdminMapper adminMapper;
    private final CandidateMapper candidateMapper;
    private final GuestMapper guestMapper;
    private final InteriorMinistryAdminMapper interiorMinistryAdminMapper;
    private final PartyAdvisorMapper partyAdvisorMapper;
    private final PartyPresidentMapper partyPresidentMapper;
    private final SuperAdminMapper superAdminMapper;
    private final VoterMapper voterMapper;


    @Override
    public UserResponse register(Registration registration) {
        try {
            User userToCreate = userMapper.toEntity(registration);
            userToCreate.setPassword(passwordEncoder.encode(registration.getPassword()));

            return authMapper.toResponse(insertUserBasedOnRole(registration));
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

    private User insertUserBasedOnRole(Registration registration) {
        Role role = registration.getRole();

        switch (role) {
            case VOTER:
                Voter voter = voterMapper.toEntity(registration);
                return voterRepository.save(voter);
            case GUEST:
                Guest guest = guestMapper.toEntity(registration);
                return guestRepository.save(guest);
            case ADMIN:
                Admin admin = adminMapper.toEntity(registration);
                return adminRepository.save(admin);
            case CANDIDATE:
                Candidate candidate = candidateMapper.toEntity(registration);
                return candidateRepository.save(candidate);
            case SUPER_ADMIN:
                SuperAdmin superAdmin = superAdminMapper.toEntity(registration);
                return superAdminRepository.save(superAdmin);
            case PARTY_ADVISOR:
                PartyAdvisor partyAdvisor = partyAdvisorMapper.toEntity(registration);
                return partyAdvisorRepository.save(partyAdvisor);
            case PARTY_PRESIDENT:
                PartyPresident partyPresident = partyPresidentMapper.toEntity(registration);
                return partyPresidentRepository.save(partyPresident);
            case INTERIOR_MINISTRY_ADMIN:
                InteriorMinistryAdmin interiorMinistryAdmin = interiorMinistryAdminMapper.toEntity(registration);
                return interiorMinistryAdminRepository.save(interiorMinistryAdmin);
            default:
                return userRepository.save(userMapper.toEntity(registration));
        }
    }

}
