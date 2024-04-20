package es.relicary.spring_basics.interfaces.impl;

import es.relicary.spring_basics.interfaces.Speakers;
import es.relicary.spring_basics.model.Song;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {

    public String makeSound(Song song){
        return "Playing the song " + song.getTitle() + " by " + song.getSingerName() + " with Bose Speakers";
    }

}