package com.electify.models.dto.response;

import com.electify.models.dto.basic.UserBasic;
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
public class PoliticalPartyResponse extends _AbstractResponse {
    private String name;
    private String logo;
    private ElectionResponse election;
    private UserBasic partyPresident;
}
