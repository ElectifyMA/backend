package com.electify.models.entities;

import jakarta.persistence.Entity;
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
public class Region extends AbstractEntity {
    private String name;
    @OneToMany(mappedBy = "region")
    private List<City> cities;
    @OneToOne(mappedBy = "region")
    private NationalListBranch nationalListBranch;
}
