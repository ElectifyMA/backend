package com.electify.services.impl;

import com.electify.exceptions.customs.ModularException;
import com.electify.mappers.CandidacyMapper;
import com.electify.models.dto.request.CandidacyRequest;
import com.electify.models.dto.response.CandidacyResponse;
import com.electify.models.entities.Candidacy;
import com.electify.models.enums.CandidacyType;
import com.electify.repositories.CandidacyRepository;
import com.electify.services.spec.ICandidacyService;
import jakarta.validation.Valid;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

@Service
public class CandidacyService extends _AbstractService<UUID, CandidacyRequest, CandidacyResponse, Candidacy, CandidacyRepository, CandidacyMapper> implements ICandidacyService {
    @Override
    @Transactional
    public Optional<CandidacyResponse> create(@Valid CandidacyRequest candidacyRequest) {
        checkCandidacyCorrectness(candidacyRequest);
        Candidacy candidacyToCreate = mapper.toEntityFromRequest(candidacyRequest);
        try {
            Candidacy createdCandidacy = repository.saveAndFlush(candidacyToCreate);
            return Optional.of(mapper.toResponse(createdCandidacy));
        } catch (DataIntegrityViolationException e) {
            throw new ModularException("a candidate cannot have multiple candidacies", HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            throw new ModularException("an error occurred while creating Candidacy, " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private void checkCandidacyCorrectness(CandidacyRequest candidacyRequest) {
        if (candidacyRequest.getType() == CandidacyType.CONSTITUENCY && candidacyRequest.getConstituency() == null)
            throw new ModularException("constituency cannot be null in a constituency candidacy", HttpStatus.BAD_REQUEST);
        if (candidacyRequest.getType() == CandidacyType.NATIONAL_LIST && candidacyRequest.getNationalListBranch() == null)
            throw new ModularException("national list branch cannot be null in a national list candidacy", HttpStatus.BAD_REQUEST);
        if (candidacyRequest.getNationalListBranch() != null && candidacyRequest.getConstituency() != null)
            throw new ModularException("a candidacy cannot be linked to both constituency and national list branch", HttpStatus.BAD_REQUEST);
    }
}
