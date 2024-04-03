package com.electify.models.dto.related;

import com.electify.models.dto.basic.CandidateBasic;
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
public class CandidacyRelated {
    private CandidacyType type;
    private CandidateBasic candidate;
    @JsonSerialize(using = ListLengthSerializer.class)
    private List<VoterBasic> votes;
}
