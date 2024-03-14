package com.electify.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@Entity
@SuperBuilder
@NoArgsConstructor
public class CandidateChairlink extends AbstractEntity {
    @OneToOne
    private Candidate candidate;
    @OneToOne
    private Chair chair;
    @ManyToOne
    private Election election;
}
