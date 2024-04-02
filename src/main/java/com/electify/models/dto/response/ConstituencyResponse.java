package com.electify.models.dto.response;

import com.electify.models.dto.basic.CityBasic;
import com.electify.models.dto.basic.ElectionBasic;
import com.electify.models.dto.basic.PartyBranchBasic;
import com.electify.models.entities.Candidacy;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public class ConstituencyResponse extends _AbstractResponse {
    @NotNull(message = "name cannot be null")
    private String name;
    @NotNull(message = "chairs count cannot be null")
    private Integer chairsCount;
    @NotNull(message = "election cannot be null")
    private ElectionBasic election;
    private List<CityBasic> cities;
    private List<PartyBranchBasic> partyBranches;
    private List<Candidacy> candidacies;
}
