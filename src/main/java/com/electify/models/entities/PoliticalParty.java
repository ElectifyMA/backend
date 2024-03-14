package com.electify.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
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
public class PoliticalParty extends AbstractEntity {
    private String name;
    private String logo;
    @OneToOne(mappedBy = "politicalParty")
    private ChairDivision chairDivision;
    @OneToOne
    private PartyPresident partyPresident;
    @ManyToMany(mappedBy = "politicalParties")
    private List<Election> elections;
}
