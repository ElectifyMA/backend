package com.electify.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@Entity
@SuperBuilder
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id")
public class Voter extends User {
    @OneToOne(mappedBy = "voter")
    private Vote vote;
}
