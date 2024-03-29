package com.electify.services.impl;

import com.electify.mappers.VoteMapper;
import com.electify.models.dto.request.VoteRequest;
import com.electify.models.dto.response.VoteResponse;
import com.electify.models.entities.Vote;
import com.electify.repositories.VoteRepository;
import com.electify.services.spec.IVoteService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class VoteService extends _AbstractService<UUID, VoteRequest, VoteResponse, Vote, VoteRepository, VoteMapper> implements IVoteService {

}
