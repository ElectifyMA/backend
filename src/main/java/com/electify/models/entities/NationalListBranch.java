package com.electify.models.entities;

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
public class NationalListBranch extends AbstractEntity {
    @ManyToOne
    private NationalList nationalList;
    @OneToOne
    private Region region;
    @OneToMany(mappedBy = "nationalListBranch")
    private List<Candidacy> candidacies;
}
