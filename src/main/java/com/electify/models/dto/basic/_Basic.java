package com.electify.models.dto.basic;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Marker interface for basic dtos (no relations data transfer objects),
 * This interface serves as a common type for all basic DTOs.
 */
public interface _Basic<ID> extends Serializable {
    ID getId();

    /**
     * Gets the timestamp when the DTO was created.
     *
     * @return The creation timestamp of the DTO.
     */
    Timestamp getCreatedAt();

    /**
     * Gets the timestamp when the DTO was last updated.
     *
     * @return The last update timestamp of the DTO.
     */
    Timestamp getUpdatedAt();
}
