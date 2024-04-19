package es.relicary.spring_basics.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "es.relicary.spring_basics.interfaces.impl",
        "es.relicary.spring_basics.services"
})
@ComponentScan(basePackageClasses = {
        es.relicary.spring_basics.beans.Vehicle.class,
        es.relicary.spring_basics.beans.Person.class
})
public class ProjectConfig {

}