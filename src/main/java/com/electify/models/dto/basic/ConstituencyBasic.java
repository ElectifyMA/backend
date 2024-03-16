package com.electify.models.dto.basic;

import com.electify.models.dto.response.ElectionResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConstituencyBasic extends AbstractBasic {
    private String name;
    private Integer chairsCount;
}
