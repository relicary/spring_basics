package es.relicary.spring_basics.examples;

import es.relicary.spring_basics.beans.Vehicle;
import es.relicary.spring_basics.config.ProjectConfig;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Log4j2
public class Example {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh = context.getBean("audiVehicle", Vehicle.class);
        log.info("Vehicle name from Spring context is: {}", veh.getName());

        veh = context.getBean("hondaVehicle", Vehicle.class);
        log.info("Vehicle name from Spring context is: {}", veh.getName());

        veh = context.getBean("ferrariVehicle", Vehicle.class);
        log.info("Vehicle name from Spring context is: {}", veh.getName());

    }
}