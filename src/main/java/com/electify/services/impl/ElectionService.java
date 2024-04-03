package com.electify.services.impl;

import com.electify.exceptions.customs.ModularException;
import com.electify.mappers.ElectionMapper;
import com.electify.models.dto.request.ElectionRequest;
import com.electify.models.dto.response.ElectionResponse;
import com.electify.models.entities.Election;
import com.electify.models.enums.ElectionStatus;
import com.electify.repositories.ElectionRepository;
import com.electify.services.spec.IElectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ElectionService extends _AbstractService<UUID, ElectionRequest, ElectionResponse, Election, ElectionRepository, ElectionMapper> implements IElectionService {
    private final ElectionRepository electionRepository;
    private final ElectionMapper electionMapper;

    @Override
    public ElectionResponse getOnGoingElection() {
        return
                electionMapper.toResponse(
                        electionRepository.
                                findTopByStatusOrderByCreatedAtDesc(ElectionStatus.ON_GOING)
                                .orElseThrow(() ->
                                        new ModularException("No ongoing elections were found",
                                                HttpStatus.NOT_FOUND)));
    }
}
