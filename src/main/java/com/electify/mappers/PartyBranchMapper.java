package com.electify.mappers;

import com.electify.models.dto.request.PartyBranchRequest;
import com.electify.models.dto.response.PartyBranchResponse;
import com.electify.models.entities.PartyBranch;
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
public interface PartyBranchMapper extends _Mapper<UUID, PartyBranchRequest, PartyBranchResponse, PartyBranch> {

}
