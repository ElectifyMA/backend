package com.electify.mappers;

import com.electify.models.dto.request.RegionRequest;
import com.electify.models.dto.response.RegionResponse;
import com.electify.models.entities.Region;
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
public interface RegionMapper extends _Mapper<UUID, RegionRequest, RegionResponse, Region> {

}
