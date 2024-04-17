package es.relicary.spring_basics.ugly;

public class SpeakerFactory {
    public Speakers getSpeaker(String sony) {
        return new Speakers();
    }
}
