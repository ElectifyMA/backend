package com.electify.models.dto.request;

import com.electify.models.dto.response.ConstituencyResponse;
import com.electify.models.dto.response.RegionResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
public class CityRequest extends _AbstractRequest {
    @NotBlank(message = "name cannot be blank")
    private String name;
    @NotNull(message = "region cannot be null")
    private RegionResponse region;
    @NotNull(message = "constituency cannot be null")
    private ConstituencyResponse constituency;
}
