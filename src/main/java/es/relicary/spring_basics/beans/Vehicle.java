package es.relicary.spring_basics.beans;

import es.relicary.spring_basics.services.VehicleService;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component("vehicleToyotaBean")
@Getter
@Setter
@Log4j2
@ToString
public class Vehicle {

    private String name = "Toyota";
    private final VehicleService vehicleService;

    public Vehicle(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

}