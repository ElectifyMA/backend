package com.electify.services.impl;

import com.electify.mappers.ElectionMapper;
import com.electify.models.dto.request.ElectionRequest;
import com.electify.models.dto.response.ElectionResponse;
import com.electify.models.entities.Election;
import com.electify.repositories.ElectionRepository;
import com.electify.services.spec.IElectionService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ElectionService extends _AbstractService<UUID, ElectionRequest, ElectionResponse, Election, ElectionRepository, ElectionMapper> implements IElectionService {

}
