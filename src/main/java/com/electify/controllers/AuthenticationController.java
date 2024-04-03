package com.electify.controllers;

import com.electify.models.dto.auth.Connection;
import com.electify.models.dto.auth.Registration;
import com.electify.services.impl.AuthenticationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("api/${version}/auth")
@CrossOrigin("http://localhost:4200")
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@Valid @RequestBody Registration registration) {
        return new ResponseEntity<>(Map.of("user", authenticationService.register(registration)), HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@Valid @RequestBody Connection connection) {
        return new ResponseEntity<>(Map.of("token", authenticationService.login(connection)), HttpStatus.OK);
    }

}
