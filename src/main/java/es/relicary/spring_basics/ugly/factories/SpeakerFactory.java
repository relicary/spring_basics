package es.relicary.spring_basics.ugly.factories;

import es.relicary.spring_basics.ugly.Speakers;
import es.relicary.spring_basics.ugly.speakers.BoseSpeakers;
import es.relicary.spring_basics.ugly.speakers.SonySpeakers;

public class SpeakerFactory {

    public Speakers getSpeaker(String speakerType) {

        if(speakerType.isEmpty()) {
            return null;
        }

        if(speakerType.equalsIgnoreCase("SONY")) {
            return new SonySpeakers();
        }
        else if(speakerType.equalsIgnoreCase("BOSE")) {
            return new BoseSpeakers();
        }

        return null;
    }
}
