package com.elviso.security.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Elvis Otieno",
                        email = "otienoelvis8@gmail.com"
                ),
                description = "Swagger Api documentation",
                title = "SpringBoot Security",
                version = "1.0",
                license = @License(
                        name = "MIT"
                )
        ),
        servers = {
                @Server(
                        description = "TEST ENV",
                        url = "http://localhost:5000"
                ),
                @Server(
                        description = "PROD ENV",
                        url = "http://localhost:5001"
                )
        }
//        security =
)
@SecurityScheme(
        name = "bearerAuth",
        description = "JWT Auth",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)
public class OpenApiConfig {
}
