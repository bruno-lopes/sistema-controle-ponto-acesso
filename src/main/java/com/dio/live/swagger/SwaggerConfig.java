package com.dio.live.swagger;

import java.util.Collections;

import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public class SwaggerConfig {
    @Bean
    public Docket apiAdmin() {
        return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.dio.live"))
        .paths(PathSelectors.ant("/**"))
        .build()
        .apiInfo(apiInfo())
        .globalOperationParameters(
            Collections.singletonList(new ParameterBuilder()
            .name("Authorization")
            .description("Header Token para JWT")
            .modelRef(new ModelRef("string"))
            .parameterType("header")
            .required(false)
            .build()
            
            )

        );
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
        .title("API REST")
        .description("Super Live Code")
        .version("1.0.0")
        .license("Apache License Version 2.0")
        .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
        .contact(new Contact("DIO", "https://web.digitalinnovation.one","contato@digitalinnovation.com.br"))
        .build()
        ;
    }
}
