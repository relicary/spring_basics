package es.relicary.spring_basics.config;

import es.relicary.spring_basics.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle audi() {
        var vehicle = new Vehicle();
        vehicle.setName("Audi");

        return vehicle;
    }

    @Bean
    Vehicle honda() {
        var vehicle = new Vehicle();
        vehicle.setName("Honda");

        return vehicle;
    }

    @Bean
    Vehicle ferrari() {
        var vehicle = new Vehicle();
        vehicle.setName("Ferrari");

        return vehicle;
    }
}