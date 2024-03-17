package com.electify.models.dto.request;

import com.electify.models.dto.response.ElectionResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
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
