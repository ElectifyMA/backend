package com.electify.models.dto.request;

import com.electify.models.dto.response.ConstituencyResponse;
import com.electify.models.dto.response.PoliticalPartyResponse;
import com.electify.models.entities.Candidate;
import com.electify.models.entities.Constituency;
import com.electify.models.entities.PartyAdvisor;
import com.electify.models.entities.PoliticalParty;
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
public class PartyBranchRequest extends _AbstractRequest {
    @NotNull(message = "party advisor cannot be null")
    private PartyAdvisor partyAdvisor;
    @NotNull(message = "political party cannot be null")
    private PoliticalPartyResponse politicalParty;
    @NotNull(message = "constituency cannot be null")
    private ConstituencyResponse constituency;
}
