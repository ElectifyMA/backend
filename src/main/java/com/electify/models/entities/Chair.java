package com.electify.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@SuperBuilder
@NoArgsConstructor
public class Chair extends AbstractEntity {
    private LocalDate date;
    @OneToOne(mappedBy = "chair")
    private CandidateChairlink candidateChairLink;
}
