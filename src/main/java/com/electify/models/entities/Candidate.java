package com.electify.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
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
public class Candidate extends User {
    @OneToOne(mappedBy = "candidate")
    private CandidateChairlink candidateChairlink;
    @OneToOne(mappedBy = "candidate")
    private Candidacy candidacy;
    @ManyToOne
    private PartyBranch partyBranch;
}
