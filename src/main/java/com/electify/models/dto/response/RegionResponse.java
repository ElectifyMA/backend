package com.electify.models.dto.response;

import com.electify.models.entities.City;
import com.electify.models.entities.NationalListBranch;
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
public class RegionResponse extends AbstractResponse {
    private String name;
    private List<City> cities;
    private NationalListBranch nationalListBranch;
}
