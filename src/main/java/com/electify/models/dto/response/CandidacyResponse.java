package com.electify.models.dto.response;

import com.electify.models.dto.basic.CandidateBasic;
import com.electify.models.dto.basic.ConstituencyBasic;
import com.electify.models.dto.basic.NationalListBranchBasic;
import com.electify.models.entities.Candidate;
import com.electify.models.entities.Constituency;
import com.electify.models.entities.NationalListBranch;
import com.electify.models.entities.Vote;
import com.electify.models.enums.CandidacyType;
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
public class CandidacyResponse extends _AbstractResponse {
    private CandidacyType type;
    private CandidateBasic candidate;
    private ConstituencyBasic constituency;
    private NationalListBranchBasic nationalListBranch;
    private List<Vote> votes;
}
