package com.electify.mappers;

import com.electify.models.dto.request.ChairRequest;
import com.electify.models.dto.response.ChairResponse;
import com.electify.models.entities.Chair;
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
public interface ChairMapper extends _Mapper<UUID, ChairRequest, ChairResponse, Chair> {

}
