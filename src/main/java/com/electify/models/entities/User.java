package com.electify.models.entities;

import com.electify.models.enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@SuperBuilder
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "_user")
public class User extends AbstractEntity {
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
