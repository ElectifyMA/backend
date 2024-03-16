package com.electify.models.dto.request;

import com.electify.models.dto.response.ElectionResponse;
import com.electify.models.entities.Candidacy;
import com.electify.models.entities.City;
import com.electify.models.entities.Election;
import com.electify.models.entities.PartyBranch;
import com.electify.models.enums.ElectionStatus;
import com.electify.models.enums.ElectionType;
import com.electify.validation.annotations.Date;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.mapstruct.Mapper;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConstituencyRequest extends AbstractRequest {
    @NotNull(message = "name cannot be null")
    private String name;
    @NotNull(message = "chairs count cannot be null")
    @Min(value = 1, message = "chairs count cannot be less than 1 chair")
    @Max(value = 305, message = "chairs count cannot be less than 305 chairs")
    private int chairsCount;
    @NotNull(message = "election cannot be null")
    private ElectionResponse election;
}
