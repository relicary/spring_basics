package es.relicary.spring_basics.config;

import es.relicary.spring_basics.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean(name = "audiVehicle")
    Vehicle audi() {
        var vehicle = new Vehicle();
        vehicle.setName("Audi");

        return vehicle;
    }

    @Bean(name = "hondaVehicle")
    Vehicle honda() {
        var vehicle = new Vehicle();
        vehicle.setName("Honda");

        return vehicle;
    }

    @Primary
    @Bean(name = "ferrariVehicle")
    Vehicle ferrari() {
        var vehicle = new Vehicle();
        vehicle.setName("Ferrari");

        return vehicle;
    }
}