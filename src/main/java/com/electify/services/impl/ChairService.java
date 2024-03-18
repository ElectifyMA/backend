package com.electify.services.impl;

import com.electify.mappers.ChairMapper;
import com.electify.models.dto.request.ChairRequest;
import com.electify.models.dto.response.ChairResponse;
import com.electify.models.entities.Chair;
import com.electify.repositories.ChairRepository;
import com.electify.services.spec.IChairService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ChairService extends _AbstractService<UUID, ChairRequest, ChairResponse, Chair, ChairRepository, ChairMapper> implements IChairService {

}
