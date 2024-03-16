package com.electify.services.impl;

import com.electify.mappers.ConstituencyMapper;
import com.electify.models.dto.request.ConstituencyRequest;
import com.electify.models.dto.response.ConstituencyResponse;
import com.electify.models.entities.Constituency;
import com.electify.repositories.ConstituencyRepository;
import com.electify.services.spec.IConstituencyService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ConstituencyService extends _AbstractService<UUID, ConstituencyRequest, ConstituencyResponse, Constituency, ConstituencyRepository, ConstituencyMapper> implements IConstituencyService {

}
