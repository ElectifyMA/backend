package com.electify.models.entities;

import com.electify.models.enums.CandidacyType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@Entity
@SuperBuilder
@NoArgsConstructor
public class Candidacy extends AbstractEntity {
    private CandidacyType type;
    @OneToOne
    private Candidate candidate;
    @ManyToOne
    private Constituency constituency;
    @ManyToOne
    private NationalListBranch nationalListBranch;
    @OneToMany(mappedBy = "candidacy")
    private List<Vote> votes;
}
