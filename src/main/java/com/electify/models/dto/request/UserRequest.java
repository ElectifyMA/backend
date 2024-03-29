package com.electify.models.dto.request;

import com.electify.models.enums.Role;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserRequest extends _AbstractRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String cin;
    private LocalDate birthDate;
    private String address;
    private boolean isActive;
    private Role role;
}
