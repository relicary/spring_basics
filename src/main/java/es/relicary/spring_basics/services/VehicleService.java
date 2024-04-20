package es.relicary.spring_basics.services;

import es.relicary.spring_basics.interfaces.Speakers;
import es.relicary.spring_basics.interfaces.Tyres;
import es.relicary.spring_basics.model.Song;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;

@Component
@Getter
@Setter
@Log4j2
public class VehicleService {

    @Autowired
    private Speakers speakers;
    @Autowired
    private Tyres tyres;

    public String playMusic(boolean vehicleStarted, Song song) {

        Instant start = Instant.now();
        log.info("'playMusic' method execution start");

        String music = null;
        if(vehicleStarted) {
            music = speakers.makeSound(song);
        }
        else {
            log.error("Vehicle not started playing music");
        }

        log.info("'playMusic' method execution end");
        Instant finish = Instant.now();

        long timeElapssed = Duration.between(start, finish).toMillis();
        log.info("Time took to execute the method 'playMusic': {}", timeElapssed);

        return music;
    }

    public String moveVehicle(boolean vehicleStarted) {
        Instant start = Instant.now();
        log.info("'moveVehicle' method execution start");

        String status = null;
        if(vehicleStarted) {
            status = tyres.rotate();
        }
        else {
            log.error("Vehicle not started moving the vehicle");
        }

        log.info("'moveVehicle' method execution end");
        Instant finish = Instant.now();

        long timeElapssed = Duration.between(start, finish).toMillis();
        log.info("Time took to execute the method 'moveVehicle': {}", timeElapssed);

        return status;
    }

    public String applyBreak(boolean vehicleStarted) {
        Instant start = Instant.now();
        log.info("'applyBreak' method execution start");

        String status = null;
        if(vehicleStarted) {
            status = tyres.stop();
        }
        else {
            log.error("Vehicle not started appliying the break");
        }

        log.info("'applyBreak' method execution end");
        Instant finish = Instant.now();

        long timeElapssed = Duration.between(start, finish).toMillis();
        log.info("Time took to execute the method 'applyBreak': {}", timeElapssed);

        return status;
    }

}