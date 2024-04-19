package es.relicary.spring_basics.beans;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@Log4j2
public class Person {

    private String name;
    private final Vehicle vehicle;

    @Autowired
    public Person(@Qualifier("vehicle2") Vehicle vehicle) {
        this.name = "Lucy";
        this.vehicle = vehicle;
        log.info("Person bean created by Spring with Vehicle");
    }

    public Person(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
        log.info("Person bean created by Spring: {}", this.name);
    }
}