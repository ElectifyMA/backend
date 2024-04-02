package com.electify.models.entities;

import jakarta.persistence.*;
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
public class Candidate extends User {
    @OneToOne(mappedBy = "candidate")
    private CandidateChairlink candidateChairlink;
    @OneToOne(mappedBy = "candidate")
    private Candidacy candidacy;
    @ManyToOne
    @JoinColumn(nullable = false)
    private PartyBranch partyBranch;
}
