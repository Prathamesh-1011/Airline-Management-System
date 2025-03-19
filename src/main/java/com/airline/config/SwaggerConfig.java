package com.airline.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springdoc.core.models.GroupedOpenApi;  // ✅ Correct Import for Springdoc v2.x

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi flightApi() {
        return GroupedOpenApi.builder()
                .group("flights")
                .pathsToMatch("/flights/**")
                .build();
    }

    @Bean
    public GroupedOpenApi ticketApi() {
        return GroupedOpenApi.builder()
                .group("tickets")
                .pathsToMatch("/tickets/**")
                .build();
    }

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Airline Management API")
                        .version("1.0")
                        .description("API documentation for the Airline Management System"));
    }
}
