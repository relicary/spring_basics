package es.relicary.spring_basics.services;

import es.relicary.spring_basics.interfaces.Speakers;
import es.relicary.spring_basics.interfaces.Tyres;
import es.relicary.spring_basics.model.Song;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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



        String music = null;
        if(vehicleStarted) {
            music = speakers.makeSound(song);
        }
        else {
            log.error("Vehicle not started playing music");
        }

        return music;
    }

    public String moveVehicle(boolean vehicleStarted) {

        String status = null;
        if(vehicleStarted) {
            status = tyres.rotate();
        }
        else {
            log.error("Vehicle not started moving the vehicle");
        }

        return status;
    }

    public String applyBreak(boolean vehicleStarted) {

        String status = null;
        if(vehicleStarted) {
            status = tyres.stop();
        }
        else {
            log.error("Vehicle not started appliying the break");
        }

        return status;
    }

}