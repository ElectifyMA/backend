package com.electify.models.dto.request;

import com.electify.models.entities.City;
import com.electify.models.entities.NationalListBranch;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotBlank;
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
public class RegionRequest extends _AbstractRequest {
    @NotBlank(message = "name cannot be blank")
    private String name;
    private List<City> cities;
    private NationalListBranch nationalListBranch;
}
