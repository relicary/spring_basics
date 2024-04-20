package es.relicary.spring_basics.beans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("personLucyBean")
@Lazy
@Getter
@Setter
@Log4j2
@ToString
public class Person {

    private String name = "Lucy";
    private final Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle) {
        log.info("Person bean created by Spring");
        this.vehicle = vehicle;
    }

}