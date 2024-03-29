package com.electify.controllers;

import com.electify.models.dto.request.NationalListRequest;
import com.electify.models.dto.response.NationalListResponse;
import com.electify.services.impl.NationalListService;
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
@RequestMapping("api/${version}/national-list")
public class NationalListController extends _Controller<UUID, NationalListRequest, NationalListResponse, NationalListService> {

}
