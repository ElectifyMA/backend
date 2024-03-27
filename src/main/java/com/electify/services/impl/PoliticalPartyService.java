package com.electify.services.impl;

import com.electify.mappers.PoliticalPartyMapper;
import com.electify.models.dto.request.PoliticalPartyRequest;
import com.electify.models.dto.response.PoliticalPartyResponse;
import com.electify.models.entities.PoliticalParty;
import com.electify.repositories.PoliticalPartyRepository;
import com.electify.services.spec.IPoliticalPartyService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PoliticalPartyService extends _AbstractService<UUID, PoliticalPartyRequest, PoliticalPartyResponse, PoliticalParty, PoliticalPartyRepository, PoliticalPartyMapper> implements IPoliticalPartyService {

}
