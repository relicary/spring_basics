package es.relicary.spring_basics.examples;

import es.relicary.spring_basics.beans.Person;
import es.relicary.spring_basics.beans.Vehicle;
import es.relicary.spring_basics.config.ProjectConfig;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Log4j2
public class Example {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);

        log.info("Person name from Spring context is: {}", person.getName());
        log.info("Vehicle name from Spring context is: {}", vehicle.getName());
        log.info("Vehicle that person own is: {}", person.getVehicle());

    }
}