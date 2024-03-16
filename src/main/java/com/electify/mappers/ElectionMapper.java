package com.electify.mappers;

import com.electify.models.dto.basic.ConstituencyBasic;
import com.electify.models.dto.request.ElectionRequest;
import com.electify.models.dto.response.ElectionResponse;
import com.electify.models.entities.Constituency;
import com.electify.models.entities.Election;
import org.mapstruct.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Mapper(
        unmappedTargetPolicy = ReportingPolicy.WARN,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        componentModel = MappingConstants.ComponentModel.SPRING
)
public interface ElectionMapper extends _Mapper<UUID, ElectionRequest, ElectionResponse, Election> {

}
