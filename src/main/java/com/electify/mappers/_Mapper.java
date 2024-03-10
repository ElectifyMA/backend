package com.electify.mappers;

import com.electify.models.dto.request._Request;
import com.electify.models.dto.response._Response;
import com.electify.models.entities._Entity;

import java.sql.Timestamp;
import java.util.List;

/**
 * Generic mapper interface for converting between DTOs (Data Transfer Objects) and entities.
 *
 * @param <ID>     The type of the entity's identifier.
 * @param <Req>    The type of the request DTO.
 * @param <Res>    The type of the response DTO.
 * @param <Entity> The type of the entity.
 */
public interface _Mapper<ID, Req extends _Request<ID>, Res extends _Response<ID>, Entity extends _Entity<ID>> {

    /**
     * Converts a request DTO to an entity.
     *
     * @param request Request DTO.
     * @return Converted entity.
     */
    Entity toEntityFromRequest(Req request);

    /**
     * Converts a response DTO to an entity.
     *
     * @param response Response DTO.
     * @return Converted entity.
     */
    Entity toEntityFromResponse(Res response);

    /**
     * Converts an entity to a response DTO.
     *
     * @param entity Entity.
     * @return Converted response DTO.
     */
    Res toResponse(Entity entity);

    /**
     * Converts a list of entities to a list of  response DTOs.
     *
     * @param entities Entities List.
     * @return Converted response DTOs List.
     */
    List<Res> toResponse(List<Entity> entities);

    /**
     * Maps a string representing the creation timestamp to a {@link Timestamp} object.
     *
     * @param createdAt String representation of the creation timestamp.
     * @return {@link Timestamp} object representing the creation timestamp.
     */
    default Timestamp mapCreatedAt(String createdAt) {
        if (createdAt == null) {
            return null;
        }
        return Timestamp.valueOf(createdAt);
    }

    /**
     * Maps a string representing the update timestamp to a {@link Timestamp} object.
     *
     * @param updatedAt String representation of the update timestamp.
     * @return {@link Timestamp} object representing the update timestamp.
     */
    default Timestamp mapUpdatedAt(String updatedAt) {
        if (updatedAt == null) {
            return null;
        }
        return Timestamp.valueOf(updatedAt);
    }
}