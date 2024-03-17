package com.electify.models.dto.response;

import com.electify.models.dto.basic.NationalListBasic;
import com.electify.models.dto.basic.RegionBasic;
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
public class NationalListBranchResponse extends AbstractResponse {
    private int chairsCount;
    private RegionBasic region;
    private NationalListBasic nationalList;
    private List<Candidacy> candidacies;
}
