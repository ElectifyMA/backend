package com.electify.mappers;

import com.electify.models.dto.request.PoliticalPartyRequest;
import com.electify.models.dto.response.PoliticalPartyResponse;
import com.electify.models.entities.PoliticalParty;
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
public interface PoliticalPartyMapper extends _Mapper<UUID, PoliticalPartyRequest, PoliticalPartyResponse, PoliticalParty> {

}
