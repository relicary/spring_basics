package es.relicary.spring_basics.beans;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@Log4j2
public class Vehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
        log.info("Vehicle bean created by Spring: {}", this.name);
    }

    @Override
    public String toString() {
        return this.name;
    }

}