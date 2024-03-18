package com.electify.models.dto.basic;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public class _AbstractBasic implements _Basic<UUID> {
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
