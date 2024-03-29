package com.electify.controllers;

import com.electify.models.dto.request.PoliticalPartyRequest;
import com.electify.models.dto.response.PoliticalPartyResponse;
import com.electify.services.impl.PoliticalPartyService;
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
@RequestMapping("api/${version}/political-party")
public class PoliticalPartyController extends _Controller<UUID, PoliticalPartyRequest, PoliticalPartyResponse, PoliticalPartyService> {

}
