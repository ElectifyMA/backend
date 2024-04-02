package com.electify.models.dto.auth;

import com.electify.models.dto.response.PartyBranchResponse;
import com.electify.models.enums.Role;
import com.electify.validation.annotations.Cin;
import com.electify.validation.annotations.Date;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Registration {
    @NotBlank(message = "First name is required")
    private String firstName;
    @NotBlank(message = "Last name is required")
    private String lastName;
    @Email(message = "Invalid email format (Ex: example@gmail.com)")
    @NotBlank(message = "Email address is required")
    private String email;
    @NotBlank(message = "Password is required")
    private String password;
    @Cin(message = "Cin code should respect this format (Ex: XX999999)")
    @NotBlank(message = "Cin code is required")
    private String cin;
    @Date
    private String birthDate;
    @NotBlank(message = "Address is required")
    private String address;
    @NotNull(message = "Role is required")
    private Role role;
    private PartyBranchResponse partyBranch;
}
