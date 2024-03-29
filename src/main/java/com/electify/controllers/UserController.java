package com.electify.controllers;

import com.electify.models.dto.request.UserRequest;
import com.electify.models.dto.response.UserResponse;
import com.electify.services.impl.UserService;
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
@RequestMapping("api/${version}/users")
public class UserController extends _Controller<UUID, UserRequest, UserResponse, UserService> {

}
