package com.electify.mappers;

import com.electify.models.dto.request.VoteRequest;
import com.electify.models.dto.response.VoteResponse;
import com.electify.models.entities.Vote;
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
public interface VoteMapper extends _Mapper<UUID, VoteRequest, VoteResponse, Vote> {

}
