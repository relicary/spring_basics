package es.relicary.spring_basics.beans;

import jakarta.annotation.PostConstruct;
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

    public void printHello() {
        log.info("Printing Hello from Component Vehicle Bean");
    }

    @PostConstruct
    public void initialize() {
        this.name = "Honda";
    }

}