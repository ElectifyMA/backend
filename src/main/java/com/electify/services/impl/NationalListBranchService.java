package com.electify.services.impl;

import com.electify.mappers.NationalListBranchMapper;
import com.electify.models.dto.request.NationalListBranchRequest;
import com.electify.models.dto.response.NationalListBranchResponse;
import com.electify.models.entities.NationalListBranch;
import com.electify.repositories.NationalListBranchRepository;
import com.electify.services.spec.INationalListBranchService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class NationalListBranchService extends _AbstractService<UUID, NationalListBranchRequest, NationalListBranchResponse, NationalListBranch, NationalListBranchRepository, NationalListBranchMapper> implements INationalListBranchService {

}
