package es.relicary.spring_basics.examples;

import es.relicary.spring_basics.beans.Person;
import es.relicary.spring_basics.beans.Vehicle;
import es.relicary.spring_basics.config.ProjectConfig;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@Log4j2
public class Example {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        String[] persons = context.getBeanNamesForType(Person.class);
        log.info("Amount of Person beans: {}", persons.length);
        Arrays.stream(persons).forEach(log::info);

        Person person = context.getBean(Person.class);

        person.getVehicle().getVehicleService().playMusic();
        person.getVehicle().getVehicleService().moveVehicle();

        String[] vehicles = context.getBeanNamesForType(Vehicle.class);
        log.info("Amount of Vehicle beans: {}", vehicles.length);
        Arrays.stream(vehicles).forEach(log::info);

        Vehicle vehicle = context.getBean(Vehicle.class);

        vehicle.getVehicleService().playMusic();
        vehicle.getVehicleService().moveVehicle();

    }
}