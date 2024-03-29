package com.electify.services.spec;

import com.electify.models.dto.request.UserRequest;
import com.electify.models.dto.response.UserResponse;

import java.util.UUID;

public interface IUserService extends _Service<UUID, UserRequest, UserResponse> {

}
