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
public class ChairDivision extends AbstractEntity {
    private Integer chairsCount;
    @ManyToOne
    private Election election;
    @OneToOne
    private PoliticalParty politicalParty;
}
