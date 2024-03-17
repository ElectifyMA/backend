package com.electify.services.impl;

import com.electify.mappers.NationalListMapper;
import com.electify.models.dto.request.NationalListRequest;
import com.electify.models.dto.response.NationalListResponse;
import com.electify.models.entities.NationalList;
import com.electify.repositories.NationalListRepository;
import com.electify.services.spec.INationalListService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class NationalListService extends _AbstractService<UUID, NationalListRequest, NationalListResponse, NationalList, NationalListRepository, NationalListMapper> implements INationalListService {

}
