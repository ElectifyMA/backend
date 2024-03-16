package com.electify.mappers;

import com.electify.models.dto.request.ElectionRequest;
import com.electify.models.dto.response.ElectionResponse;
import com.electify.models.entities.Election;
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
public interface ElectionMapper extends _Mapper<UUID, ElectionRequest, ElectionResponse, Election> {

}
