package es.relicary.spring_basics;

import es.relicary.spring_basics.beans.Vehicle;
import es.relicary.spring_basics.config.ProjectConfig;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
@Log4j2
public class SpringBasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBasicsApplication.class, args);

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
