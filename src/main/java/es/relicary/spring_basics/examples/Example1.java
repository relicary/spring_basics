package es.relicary.spring_basics.examples;

import es.relicary.spring_basics.beans.Vehicle;
import es.relicary.spring_basics.config.ProjectConfig;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Log4j2
public class Example1 {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        log.info("Vehicle name from non-spring context is: {}", vehicle.getName());

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh = context.getBean(Vehicle.class);
        log.info("Vehicle name from Spring context is: {}", veh.getName());

        String hello = context.getBean(String.class);
        log.info("String value from Spring context is: {}", hello);

        Integer num = context.getBean(Integer.class);
        log.info("Integer value from Spring context is: {}", num);

    }
}