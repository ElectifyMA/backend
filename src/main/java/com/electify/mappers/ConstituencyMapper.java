package com.electify.mappers;

import com.electify.models.dto.request.ConstituencyRequest;
import com.electify.models.dto.response.ConstituencyResponse;
import com.electify.models.entities.Constituency;
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
public interface ConstituencyMapper extends _Mapper<UUID, ConstituencyRequest, ConstituencyResponse, Constituency> {

}
