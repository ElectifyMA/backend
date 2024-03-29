package com.electify.services.impl;

import com.electify.mappers.UserMapper;
import com.electify.models.dto.request.UserRequest;
import com.electify.models.dto.response.UserResponse;
import com.electify.models.entities.User;
import com.electify.repositories.UserRepository;
import com.electify.services.spec.IUserService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService extends _AbstractService<UUID, UserRequest, UserResponse, User, UserRepository, UserMapper> implements IUserService {

}
