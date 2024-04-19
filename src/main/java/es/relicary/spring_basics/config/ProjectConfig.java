package es.relicary.spring_basics.config;

import es.relicary.spring_basics.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "es.relicary.spring_basics.beans")
public class ProjectConfig {
    @Bean
    Vehicle vehicle1() {
        return new Vehicle("Audi");
    }

    @Bean
    Vehicle vehicle2() {
        return new Vehicle("Honda");
    }

    @Bean
    Vehicle vehicle3() {
        return new Vehicle("Ferrari");
    }
}