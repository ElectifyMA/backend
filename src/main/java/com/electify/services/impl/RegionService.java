package com.electify.services.impl;

import com.electify.mappers.RegionMapper;
import com.electify.models.dto.request.RegionRequest;
import com.electify.models.dto.response.RegionResponse;
import com.electify.models.entities.Region;
import com.electify.repositories.RegionRepository;
import com.electify.services.spec.IRegionService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RegionService extends _AbstractService<UUID, RegionRequest, RegionResponse, Region, RegionRepository, RegionMapper> implements IRegionService {

}
