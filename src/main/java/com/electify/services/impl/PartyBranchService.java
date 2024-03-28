package com.electify.services.impl;

import com.electify.mappers.PartyBranchMapper;
import com.electify.models.dto.request.PartyBranchRequest;
import com.electify.models.dto.response.PartyBranchResponse;
import com.electify.models.entities.PartyBranch;
import com.electify.repositories.PartyBranchRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PartyBranchService extends _AbstractService<UUID, PartyBranchRequest, PartyBranchResponse, PartyBranch, PartyBranchRepository, PartyBranchMapper>{

}
