package com.electify.mappers;

import com.electify.models.dto.request.CandidacyRequest;
import com.electify.models.dto.response.CandidacyResponse;
import com.electify.models.entities.Candidacy;
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
public interface CandidacyMapper extends _Mapper<UUID, CandidacyRequest, CandidacyResponse, Candidacy>{

}
