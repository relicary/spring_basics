package es.relicary.spring_basics.examples;

import es.relicary.spring_basics.beans.Vehicle;
import es.relicary.spring_basics.config.ProjectConfig;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Log4j2
public class Example2 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh = context.getBean("audi", Vehicle.class);
        log.info("Vehicle name from Spring context is: {}", veh.getName());

        veh = context.getBean("honda", Vehicle.class);
        log.info("Vehicle name from Spring context is: {}", veh.getName());

        veh = context.getBean("ferrari", Vehicle.class);
        log.info("Vehicle name from Spring context is: {}", veh.getName());

    }
}