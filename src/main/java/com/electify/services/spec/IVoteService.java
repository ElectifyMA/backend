package com.electify.services.spec;

import com.electify.models.dto.request.VoteRequest;
import com.electify.models.dto.response.VoteResponse;

import java.util.UUID;

public interface IVoteService extends _Service<UUID, VoteRequest, VoteResponse> {

}
