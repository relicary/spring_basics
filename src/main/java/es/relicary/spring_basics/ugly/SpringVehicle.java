package es.relicary.spring_basics.ugly;

import org.springframework.beans.factory.annotation.Autowired;

public class SpringVehicle {

    @Autowired
    private Speakers speakers;

    @Autowired
    private Tyres tyres;

    public void makeVehicle() {
        speakers.makeSound();
        tyres.rotate();
    }
}