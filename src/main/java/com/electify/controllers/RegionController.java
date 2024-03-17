package com.electify.controllers;

import com.electify.models.dto.request.RegionRequest;
import com.electify.models.dto.response.RegionResponse;
import com.electify.services.impl.RegionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/region")
public class RegionController extends _Controller<UUID, RegionRequest, RegionResponse, RegionService> {

}
