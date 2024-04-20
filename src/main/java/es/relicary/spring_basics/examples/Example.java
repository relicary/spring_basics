package es.relicary.spring_basics.examples;

import es.relicary.spring_basics.config.ProjectConfig;
import es.relicary.spring_basics.services.VehicleService;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Log4j2
public class Example {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        VehicleService vehicleService1 = context.getBean(VehicleService.class);
        VehicleService vehicleService2 = context.getBean(VehicleService.class);

        log.info("Hashcode of the object vehicleService 1: {}", vehicleService1.hashCode());
        log.info("Hashcode of the object vehicleService 2: {}", vehicleService2.hashCode());

        if(vehicleService1 == vehicleService2) {
            log.info("VehicleService bean is a singleton scoped bean");
        }
        else {
            log.info("VehicleService bean is a prototype scoped bean");
        }
    }
}