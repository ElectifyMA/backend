package com.electify.mappers;

import com.electify.models.dto.request.NationalListBranchRequest;
import com.electify.models.dto.response.NationalListBranchResponse;
import com.electify.models.entities.NationalListBranch;
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
public interface NationalListBranchMapper extends _Mapper<UUID, NationalListBranchRequest, NationalListBranchResponse, NationalListBranch> {

}
