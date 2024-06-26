package com.electify.models.entities;

import com.electify.models.enums.ElectionStatus;
import com.electify.models.enums.ElectionType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@SuperBuilder
@NoArgsConstructor
public class Election extends AbstractEntity {
    private LocalDate date;
    private Integer duration;
    @Enumerated(EnumType.STRING)
    private ElectionType type;
    @Enumerated(EnumType.STRING)
    private ElectionStatus status;
    @OneToMany(mappedBy = "election")
    @Cascade(CascadeType.DELETE_ORPHAN)
    private List<NationalList> nationalListList;
    @OneToMany(mappedBy = "election")
    @Cascade(CascadeType.DELETE_ORPHAN)
    private List<Constituency> constituencies;
    @OneToMany
    private List<PoliticalParty> politicalParties;
}
