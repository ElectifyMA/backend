package com.electify.models.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AbstractRequest implements _Request<UUID> {
    /**
     * The unique identifier of the entity.
     */
    private UUID id;

    /**
     * The timestamp when the entity was created.
     */
    private Timestamp createdAt;

    /**
     * The timestamp when the entity was last updated.
     */
    private Timestamp updatedAt;
}
