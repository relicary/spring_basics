package es.relicary.spring_basics.ugly.speakers;

import es.relicary.spring_basics.ugly.Speakers;

public class SonySpeakers implements Speakers {
    public String makeSound() {
        return "Dance Sony!";
    }
}