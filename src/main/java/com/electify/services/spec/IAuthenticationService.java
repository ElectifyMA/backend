package com.electify.services.spec;

import com.electify.models.dto.auth.Connection;
import com.electify.models.dto.auth.Registration;
import com.electify.models.dto.response.UserResponse;

public interface IAuthenticationService {
    UserResponse register(Registration registration);
    public String login(Connection connection);
}
