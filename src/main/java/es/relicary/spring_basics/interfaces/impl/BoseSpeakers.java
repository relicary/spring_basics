package es.relicary.spring_basics.interfaces.impl;

import es.relicary.spring_basics.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {

    public String makeSound(){
        return "Playing music with Bose speakers";
    }

}