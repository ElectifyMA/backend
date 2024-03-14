package com.electify.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
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
public class PartyBranch extends AbstractEntity {
    @OneToOne(mappedBy = "partyBranch")
    private PartyAdvisor partyAdvisor;
    @ManyToOne
    private PoliticalParty politicalParty;
    @ManyToOne
    private Constituency constituency;
    @OneToMany(mappedBy = "partyBranch")
    private List<Candidate> candidates;
}
