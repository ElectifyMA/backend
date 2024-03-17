package com.electify.mappers;

import com.electify.models.dto.request.CityRequest;
import com.electify.models.dto.response.CityResponse;
import com.electify.models.entities.City;
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
public interface CityMapper extends _Mapper<UUID, CityRequest, CityResponse, City> {

}
