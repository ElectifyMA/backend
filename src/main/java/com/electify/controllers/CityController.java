package com.electify.controllers;

import com.electify.models.dto.request.CityRequest;
import com.electify.models.dto.response.CityResponse;
import com.electify.services.impl.CityService;
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
@RequestMapping("api/${version}/city")
public class CityController extends _Controller<UUID, CityRequest, CityResponse, CityService> {
    
}
