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
        return speakers.makeSound(song);
    }

    public String moveVehicle(boolean vehicleStarted) {
        return tyres.rotate();
    }

    public String applyBreak(boolean vehicleStarted) {
        return tyres.stop();
    }

}