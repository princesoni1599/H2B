package com.example.h2b.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("My Application API")
                        .version("1.0.0")
                        .description("API documentation for My Application")
                        .contact(new Contact()
                                .name("John Doe")
                                .email("john.doe@example.com")
                                .url("https://example.com")));
    }
}
