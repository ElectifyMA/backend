package com.electify.controllers;

import com.electify.models.dto.request.CandidacyRequest;
import com.electify.models.dto.response.CandidacyResponse;
import com.electify.services.impl.CandidacyService;
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
@RequestMapping("api/${version}/candidacy")
public class CandidacyController extends _Controller<UUID, CandidacyRequest, CandidacyResponse, CandidacyService> {

}
