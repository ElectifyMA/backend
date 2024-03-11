package com.electify.models.entities;

import com.electify.models.enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@SuperBuilder
@NoArgsConstructor
@Inheritance
@Table(name = "_user")
public class User extends AbstractEntity {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String cin;
    private LocalDateTime birthDate;
    private String address;
    private boolean isActive;
    private Role role;
}
