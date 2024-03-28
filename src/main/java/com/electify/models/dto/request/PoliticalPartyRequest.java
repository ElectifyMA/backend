package com.electify.models.dto.request;

import com.electify.models.dto.response.ElectionResponse;
import com.electify.models.entities.User;
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
public class PoliticalPartyRequest extends _AbstractRequest {
    @NotBlank(message = "name cannot be blank")
    private String name;
    @NotBlank(message = "logo cannot be blank")
    private String logo;
    @NotNull(message = "election cannot be null")
    private ElectionResponse election;
    @NotNull(message = "party president cannot be null")
    private User partyPresident;
}
