package com.electify.services.impl;

import com.electify.exceptions.customs.ModularException;
import com.electify.mappers.VoteMapper;
import com.electify.models.dto.auth.AuthUser;
import com.electify.models.dto.request.VoteRequest;
import com.electify.models.dto.response.VoteResponse;
import com.electify.models.entities.Vote;
import com.electify.models.entities.Voter;
import com.electify.repositories.VoteRepository;
import com.electify.services.spec.IVoteService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
public class VoteService extends _AbstractService<UUID, VoteRequest, VoteResponse, Vote, VoteRepository, VoteMapper> implements IVoteService {
    @Override
    @Transactional
    public Optional<VoteResponse> create(@Valid VoteRequest request) {
        Vote entityToCreate = mapper.toEntityFromRequest(request);
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        AuthUser authUser = (AuthUser) authentication.getPrincipal();

        Voter voter = Voter.builder()
                .id( authUser.getUser().getId() )
                .firstName( authUser.getUser().getFirstName() )
                .lastName( authUser.getUser().getLastName() )
                .email( authUser.getUser().getEmail() )
                .password( authUser.getUser().getPassword() )
                .cin( authUser.getUser().getCin() )
                .birthDate( authUser.getUser().getBirthDate() )
                .address( authUser.getUser().getAddress() )
                .role( authUser.getUser().getRole() )
                .build();

        entityToCreate.setVoter(voter);

        try {
            Vote createdEntity = repository.saveAndFlush(entityToCreate);
            return Optional.of(mapper.toResponse(createdEntity));
        } catch (DataIntegrityViolationException e) {
            throw new ModularException("Voter cannot vote multiple times", HttpStatus.BAD_REQUEST);
        }
    }
}
