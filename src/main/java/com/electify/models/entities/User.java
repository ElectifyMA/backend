package com.electify.models.entities;

import com.electify.models.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@SuperBuilder
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "_user")
@ToString(callSuper = true)
public class User extends AbstractEntity {
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String password;
    @Column(unique = true)
    private String cin;
    private LocalDate birthDate;
    private String address;
    @Column(columnDefinition = "BOOLEAN DEFAULT true")
    private boolean isActive;
    @Enumerated(EnumType.STRING)
    private Role role;
}
