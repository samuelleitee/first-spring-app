package com.example.first_spring_app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    // Criação de instância de classes que não podem ser gerenciadas pelo Spring Boot nativamente (@Autowired)
    @Bean
    public String helloWorld() {
       return "Hello, World!";
    }

}
