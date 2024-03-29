package com.electify.models.dto.response;

import com.electify.models.dto.basic.CandidacyBasic;
import com.electify.models.dto.basic.ElectionBasic;
import com.electify.models.dto.basic.VoterBasic;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public class VoteResponse extends _AbstractResponse {
    private VoterBasic voter;
    private ElectionBasic election;
    private CandidacyBasic candidacy;
}
