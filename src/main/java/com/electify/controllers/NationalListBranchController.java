package com.electify.controllers;

import com.electify.models.dto.request.NationalListBranchRequest;
import com.electify.models.dto.response.NationalListBranchResponse;
import com.electify.services.impl.NationalListBranchService;
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
@RequestMapping("api/v1/national-list-branch")
public class NationalListBranchController extends _Controller<UUID, NationalListBranchRequest, NationalListBranchResponse, NationalListBranchService> {

}
