package com.electify.models.dto.basic;

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
public class CandidacyBasic extends _AbstractBasic {
    private CandidacyType type;
    @JsonSerialize(using = ListLengthSerializer.class)
    private List<VoterBasic> votes;
}
