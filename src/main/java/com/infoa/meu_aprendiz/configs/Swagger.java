package com.infoa.meu_aprendiz.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Meu Aprendiz",
        version = "1.0",
        description = "API para o sistema Meu Aprendiz"
    )
)
public class Swagger {

}