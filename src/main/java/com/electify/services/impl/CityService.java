package com.electify.services.impl;

import com.electify.mappers.CityMapper;
import com.electify.models.dto.request.CityRequest;
import com.electify.models.dto.response.CityResponse;
import com.electify.models.entities.City;
import com.electify.repositories.CityRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CityService extends _AbstractService<UUID, CityRequest, CityResponse, City, CityRepository, CityMapper> {

}
