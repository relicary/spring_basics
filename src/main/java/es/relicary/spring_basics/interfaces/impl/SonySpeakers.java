package es.relicary.spring_basics.interfaces.impl;

import es.relicary.spring_basics.interfaces.Speakers;
import es.relicary.spring_basics.model.Song;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {

    public String makeSound(Song song){
        return "Playing the song " + song.getTitle() + " by " + song.getSingerName() + " with Sony Speakers";
    }

}