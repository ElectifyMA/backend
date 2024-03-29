package com.electify.mappers;

import com.electify.models.dto.auth.Registration;
import com.electify.models.dto.request.UserRequest;
import com.electify.models.dto.response.UserResponse;
import com.electify.models.entities.User;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.UUID;

@Mapper(
        unmappedTargetPolicy = ReportingPolicy.WARN,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        componentModel = MappingConstants.ComponentModel.SPRING
)
public interface UserMapper extends _Mapper<UUID, UserRequest, UserResponse, User> {
    User toEntity(Registration registration);
}
