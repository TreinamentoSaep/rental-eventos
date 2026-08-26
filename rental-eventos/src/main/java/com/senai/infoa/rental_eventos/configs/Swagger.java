package com.senai.infoa.rental_eventos.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "API de treinamento",
        version = "1.0.",
        description = "API para treinamento SAEP"
    )
)
public class Swagger {
    
}
