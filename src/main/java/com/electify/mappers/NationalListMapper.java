package com.electify.mappers;

import com.electify.models.dto.request.NationalListRequest;
import com.electify.models.dto.response.NationalListResponse;
import com.electify.models.entities.NationalList;
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
public interface NationalListMapper extends _Mapper<UUID, NationalListRequest, NationalListResponse, NationalList> {

}
