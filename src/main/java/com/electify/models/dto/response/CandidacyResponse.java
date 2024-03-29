package com.electify.models.dto.response;

import com.electify.models.dto.basic.CandidateBasic;
import com.electify.models.dto.basic.ConstituencyBasic;
import com.electify.models.dto.basic.NationalListBranchBasic;
import com.electify.models.dto.basic.VoterBasic;
import com.electify.models.enums.CandidacyType;
import com.electify.serializers.ListLengthSerializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
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
    @JsonSerialize(using = ListLengthSerializer.class)
    private List<VoterBasic> votes;
}
