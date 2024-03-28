package com.electify.models.dto.related;

import com.electify.models.dto.response.PoliticalPartyResponse;
import com.electify.models.enums.ElectionStatus;
import com.electify.models.enums.ElectionType;
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
public class ElectionRel {
    private String date;
    private Integer duration;
    private ElectionType type;
    private ElectionStatus status;
    private List<PoliticalPartyResponse> politicalParties;
}
