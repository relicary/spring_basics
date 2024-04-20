package es.relicary.spring_basics.services;

import es.relicary.spring_basics.interfaces.Speakers;
import es.relicary.spring_basics.interfaces.Tyres;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Getter
@Setter
@Log4j2
public class VehicleService {

    @Autowired
    private Speakers speakers;
    @Autowired
    private Tyres tyres;

    public void playMusic() {
        String music = speakers.makeSound();
        log.info(music);
    }

    public void moveVehicle() {
        String status = tyres.rotate();
        log.info(status);
    }

}