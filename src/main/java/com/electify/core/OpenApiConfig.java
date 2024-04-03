package com.electify.core;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "mohamed bourra",
                        email = "mohamedbourra007@gmail.com"
                ),
                description = "OpenApi documentation for ElectifyMa Project",
                title = "OpenApi specification - bourra",
                version = "1.0",
                termsOfService = "Terms of service"
        ),
        servers = {@Server(
                description = "Local ENV",
                url = "http://localhost:8080"
        )},
        security = {@SecurityRequirement(
                name = "bearerAuth"
        )}
)
@SecurityScheme(
        name = "bearerAuth",
        description = "JWT auth description",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)
public class OpenApiConfig {
    public OpenApiConfig() {
    }
}
