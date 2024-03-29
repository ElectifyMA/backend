package com.electify.models.dto.request;

import com.electify.models.dto.response.CandidacyResponse;
import com.electify.models.dto.response.ElectionResponse;
import com.electify.models.entities.Candidacy;
import com.electify.models.entities.Election;
import com.electify.models.entities.Voter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public class VoteRequest extends _AbstractRequest {
    @NotNull(message = "voter cannot be null")
    private Voter voter;
    @NotNull(message = "election cannot be null")
    private ElectionResponse election;
    @NotNull(message = "candidacy cannot be null")
    private CandidacyResponse candidacy;
}
