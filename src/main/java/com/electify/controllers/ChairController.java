package com.electify.controllers;

import com.electify.models.dto.request.ChairRequest;
import com.electify.models.dto.response.ChairResponse;
import com.electify.services.impl.ChairService;
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
@RequestMapping("api/${version}/chair")
public class ChairController extends _Controller<UUID, ChairRequest, ChairResponse, ChairService> {

}
