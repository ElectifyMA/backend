package com.electify.services.spec;

import com.electify.models.dto.request.ElectionRequest;
import com.electify.models.dto.response.ElectionResponse;

import java.util.UUID;

public interface IElectionService extends _Service<UUID, ElectionRequest, ElectionResponse>{
    ElectionResponse getOnGoingElection();
}
