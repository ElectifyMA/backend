package com.electify.models.dto.request;

import com.electify.models.dto.response.ElectionResponse;
import com.electify.validation.annotations.Date;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public class NationalListRequest extends _AbstractRequest {
    @NotNull(message = "date cannot be null")
    @Date
    private String date;
    @NotNull(message = "election cannot be null")
    private ElectionResponse election;
}
