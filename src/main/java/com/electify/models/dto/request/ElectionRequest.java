package com.electify.models.dto.request;

import com.electify.models.entities.Constituency;
import com.electify.models.entities.NationalList;
import com.electify.models.entities.PoliticalParty;
import com.electify.models.enums.ElectionStatus;
import com.electify.models.enums.ElectionType;
import com.electify.validation.annotations.Date;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ElectionRequest extends AbstractRequest {
    @NotNull(message = "date cannot be null")
    @Date
    private String date;
    @NotNull(message = "duration cannot be blank")
    private Integer duration;
    @NotNull(message = "election type cannot be null")
    private ElectionType type;
    @NotNull(message = "election status cannot be null")
    private ElectionStatus status;
}
