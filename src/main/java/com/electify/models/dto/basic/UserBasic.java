package com.electify.models.dto.basic;

import com.electify.models.enums.Role;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public class UserBasic extends _AbstractBasic {
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
