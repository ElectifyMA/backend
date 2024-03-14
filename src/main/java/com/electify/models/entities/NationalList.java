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
public class NationalList extends AbstractEntity {
    @OneToMany(mappedBy = "nationalList")
    private List<NationalListBranch> branches;
    @ManyToOne
    private Election election;
}
