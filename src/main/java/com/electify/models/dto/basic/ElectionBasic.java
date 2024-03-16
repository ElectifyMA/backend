package com.electify.models.dto.basic;

import com.electify.models.enums.ElectionStatus;
import com.electify.models.enums.ElectionType;
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
public class ElectionBasic extends AbstractBasic {
    private String date;
    private Integer duration;
    private ElectionType type;
    private ElectionStatus status;
}
