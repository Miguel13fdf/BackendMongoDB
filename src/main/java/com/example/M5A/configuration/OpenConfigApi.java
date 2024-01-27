package com.example.M5A.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenConfigApi {
	@Bean
	OpenAPI usersMicroserviceOpenAPI() {
		return new OpenAPI().info(new Info().title("Documentación de API REST")
				.description("Documentación de la implementación de una API REST para "
						+ "back-end basada en MVC con el uso de Spring Boot")
				.version("1.0"));
	}
}
