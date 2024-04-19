package es.relicary.spring_basics.beans;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personLucyBean")
@Getter
@Setter
@Log4j2
public class Person {

    private String name = "Lucy";
    private final Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

}