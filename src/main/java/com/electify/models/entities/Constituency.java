package com.electify.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
public class Constituency extends AbstractEntity {
    private String name;
    private Integer chairsCount;
    @ManyToOne
    private Election election;
    @OneToMany(mappedBy = "constituency")
    private List<City> cities;
    @OneToMany(mappedBy = "constituency")
    private List<PartyBranch> partyBranches;
    @OneToMany(mappedBy = "constituency")
    private List<Candidacy> candidacies;
}
