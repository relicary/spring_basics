package es.relicary.spring_basics.examples;

import es.relicary.spring_basics.beans.Vehicle;
import es.relicary.spring_basics.config.ProjectConfig;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

@Log4j2
public class Example {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle volkswagen = new Vehicle("Volkswagen");
        Supplier<Vehicle> volkswagenSupplier = () -> volkswagen;

        Supplier<Vehicle> audiSupplier = () -> new Vehicle("Audi");

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        log.info("randomNumber = {}", randomNumber);

        if((randomNumber% 2) == 0) {
            context.registerBean("volkswagen", Vehicle.class, volkswagenSupplier);
        }
        else {
            context.registerBean("audi", Vehicle.class, audiSupplier);
        }

        Vehicle volksVehicle = null;
        Vehicle audiVehicle = null;

        try {
            volksVehicle = context.getBean("volkswagen", Vehicle.class);
        } catch (NoSuchBeanDefinitionException ex) {
            log.error("Error while creating Volkswagen vehicle");
        }

        try {
            audiVehicle = context.getBean("audi",Vehicle.class);
        }catch (NoSuchBeanDefinitionException ex){
            log.error("Error while creating Audi vehicle");
        }

        if(null != volksVehicle){
            log.info("Programming Vehicle name from Spring Context is: {}", volksVehicle.getName());
        }
        else {
            log.info("Programming Vehicle name from Spring Context is: {}", audiVehicle.getName());
        }

    }
}