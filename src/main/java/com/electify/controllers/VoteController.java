package com.electify.controllers;

import com.electify.models.dto.request.VoteRequest;
import com.electify.models.dto.response.VoteResponse;
import com.electify.services.impl.VoteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("api/${version}/vote")
@CrossOrigin("http://localhost:4200")
public class VoteController extends _Controller<UUID, VoteRequest, VoteResponse, VoteService> {

}
