package es.relicary.spring_basics.config;

import es.relicary.spring_basics.beans.Person;
import es.relicary.spring_basics.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Vehicle vehicle() {
        return new Vehicle("Toyota");
    }

    @Bean
    public Person person() {
        return new Person("Lucy", vehicle());
    }
}