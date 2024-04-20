package es.relicary.spring_basics.examples;

import es.relicary.spring_basics.beans.Person;
import es.relicary.spring_basics.config.ProjectConfig;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Log4j2
public class Example {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        log.info("Before retrieving the Person bean from the Spring Context");
        context.getBean(Person.class);
        log.info("After retrieving the Person bean from the Spring Context");
    }
}