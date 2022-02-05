package com.adriel.frete.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SpringFoxConfig {

    @Bean
    public Docket swagger() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.adriel.frete.controllers"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(info())
                .useDefaultResponseMessages(false);
    }

    private ApiInfo info() {
        ApiInfo apiInfo = new ApiInfo(
                "Consulta Frete",
                "API REST para consulta de preço de frete.",
                "1.0",
                "Termos de Serviço",
                new Contact("Adriel Felix", "https://www.linkedin.com/in/adriel-felix/", "adrielandrade3@gmail.com"),
                "Github",
                "https://github.com/adriel-dev",
                new ArrayList<VendorExtension>());
        return apiInfo;
    }

}
