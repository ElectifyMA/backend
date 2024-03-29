package com.electify.models.dto.request;

import com.electify.models.entities.Candidate;
import com.electify.models.entities.Constituency;
import com.electify.models.entities.NationalListBranch;
import com.electify.models.entities.Vote;
import com.electify.models.enums.CandidacyType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CandidacyRequest extends _AbstractRequest {
    @NotNull(message = "candidacy type cannot be null")
    private CandidacyType type;
    @NotNull(message = "candidate cannot be null")
    private Candidate candidate;
    private Constituency constituency;
    private NationalListBranch nationalListBranch;
}
