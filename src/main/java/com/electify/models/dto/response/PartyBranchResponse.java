package com.electify.models.dto.response;

import com.electify.models.dto.basic.ConstituencyBasic;
import com.electify.models.dto.basic.PartyAdvisorBasic;
import com.electify.models.dto.basic.PoliticalPartyBasic;
import com.electify.models.entities.Candidate;
import com.electify.models.entities.PartyAdvisor;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PartyBranchResponse extends _AbstractResponse {
    private PartyAdvisorBasic partyAdvisor;
    private PoliticalPartyBasic politicalParty;
    private ConstituencyBasic constituency;
    private List<Candidate> candidates;
}
