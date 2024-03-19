package com.electify.models.dto.response;

import com.electify.models.enums.Role;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserResponse extends _AbstractResponse {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String cin;
    private String birthDate;
    private String address;
    private boolean isActive;
    private Role role;
}
