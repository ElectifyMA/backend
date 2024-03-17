package com.electify.models.dto.response;

import com.electify.models.dto.basic.ConstituencyBasic;
import com.electify.models.dto.basic.RegionBasic;
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
public class CityResponse extends AbstractResponse {
    private String name;
    private RegionBasic region;
    private ConstituencyBasic constituency;
}
