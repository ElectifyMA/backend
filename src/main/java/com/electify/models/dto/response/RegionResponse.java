package com.electify.models.dto.response;

import com.electify.models.dto.basic.CityBasic;
import com.electify.models.dto.basic.NationalListBranchBasic;
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
public class RegionResponse extends _AbstractResponse {
    private String name;
    private List<CityBasic> cities;
    private NationalListBranchBasic nationalListBranch;
}
