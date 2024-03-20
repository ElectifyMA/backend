package com.electify.mappers.auth;

import com.electify.models.dto.auth.Registration;
import com.electify.models.entities._Entity;

public interface AuthMapper<ID, Entity extends _Entity<ID>> {
    Entity toEntity(Registration registration);
}
