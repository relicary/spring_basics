package es.relicary.spring_basics.beans;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
@Log4j2
public class Person {

    @Setter
    private String name;
    private Vehicle vehicle;

    public Person() {
        this.name = "Lucy";
        log.info("Person bean created by Spring");
    }

    public Person(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
        log.info("Person bean created by Spring: {}", this.name);
    }

    @Autowired
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}