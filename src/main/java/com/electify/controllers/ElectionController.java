package com.electify.controllers;

import com.electify.models.dto.request.ElectionRequest;
import com.electify.models.dto.response.ElectionResponse;
import com.electify.services.impl.ElectionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("api/${version}/election")
@CrossOrigin("${allowed-origin}")
public class ElectionController extends _Controller<UUID, ElectionRequest, ElectionResponse, ElectionService>{
    @GetMapping("/current")
    public ResponseEntity<ElectionResponse> getOnGoingElection() {
        return new ResponseEntity<>(service.getOnGoingElection(), HttpStatus.OK);
    }
}
