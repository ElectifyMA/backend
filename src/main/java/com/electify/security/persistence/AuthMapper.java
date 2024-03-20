package com.electify.security.persistence;


import com.electify.models.dto.auth.AuthUser;
import com.electify.models.dto.auth.Registration;
import com.electify.models.dto.response.UserResponse;
import com.electify.models.entities.User;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(
        unmappedTargetPolicy = ReportingPolicy.WARN,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        componentModel = MappingConstants.ComponentModel.SPRING
)
public interface AuthMapper {
    UserResponse toResponse(User user);
    User toEntity(Registration registration);
    AuthUser toUserDetails(User user);
}
