package ru.adastra.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import ru.adastra.jpa.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import ru.adastra.jpa.model.Customer;

@SpringBootApplication
@EnableWebMvc
@ComponentScan("ru.adastra")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}