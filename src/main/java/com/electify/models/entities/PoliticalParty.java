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
public class PoliticalParty extends AbstractEntity {
    private String name;
    private String logo;
    @OneToOne(mappedBy = "politicalParty")
    private ChairDivision chairDivision;
    @OneToOne
    private PartyPresident partyPresident;
    @ManyToOne()
    @JoinColumn(nullable = false)
    private Election election;
}
