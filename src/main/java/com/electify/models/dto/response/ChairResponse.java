package com.electify.models.dto.response;

import com.electify.models.entities.CandidateChairlink;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChairResponse extends AbstractResponse {
    private LocalDate date;
    private CandidateChairlink candidateChairLink;
}
