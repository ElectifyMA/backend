package com.electify.models.dto.request;

import com.electify.models.dto.response.NationalListResponse;
import com.electify.models.dto.response.RegionResponse;
import com.electify.models.entities.Candidacy;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
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
public class NationalListBranchRequest extends _AbstractRequest {
    @NotNull(message = "chairs count cannot be null")
    @Min(value = 1, message = "chairs count cannot be less than 1 chair")
    @Max(value = 305, message = "chairs count cannot be less than 305 chairs")
    private int chairsCount;
    @NotNull(message = "region cannot be null")
    private RegionResponse region;
    @NotNull(message = "national list cannot be null")
    private NationalListResponse nationalList;
    private List<Candidacy> candidacies;
}
