package com.electify.models.entities;

import jakarta.persistence.Entity;
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
public class Chair extends AbstractEntity {
    @OneToOne(mappedBy = "chair")
    private CandidateChairlink candidateChairLink;
}
