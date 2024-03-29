package com.electify.controllers;

import com.electify.models.dto.request.ConstituencyRequest;
import com.electify.models.dto.response.ConstituencyResponse;
import com.electify.services.impl.ConstituencyService;
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
@RequestMapping("api/${version}/constituency")
public class ConstituencyController extends _Controller<UUID, ConstituencyRequest, ConstituencyResponse, ConstituencyService> {

}
