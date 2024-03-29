package com.electify.controllers;

import com.electify.models.dto.request.PartyBranchRequest;
import com.electify.models.dto.response.PartyBranchResponse;
import com.electify.services.impl.PartyBranchService;
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
@RequestMapping("api/${version}/party-branch")
public class PartyBranchController extends _Controller<UUID, PartyBranchRequest, PartyBranchResponse, PartyBranchService> {

}
