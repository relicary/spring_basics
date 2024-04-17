package es.relicary.spring_basics.ugly;

import es.relicary.spring_basics.ugly.factories.SpeakerFactory;
import es.relicary.spring_basics.ugly.factories.TyreFactory;
import es.relicary.spring_basics.ugly.speakers.SonySpeakers;
import es.relicary.spring_basics.ugly.tyres.MichelinTyres;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Vehicle {

    public void makeVehicle1(){
        SonySpeakers sonySpeakers = new SonySpeakers();
        log.info(sonySpeakers.makeSound());
        MichelinTyres michelinTyres = new MichelinTyres();
        log.info(michelinTyres.rotate());
    }

    public void makeVehicle2(){
        SpeakerFactory speakerFactory = new SpeakerFactory();
        Speakers speakers = speakerFactory.getSpeaker("Sony");
        log.info(speakers.makeSound());

        TyreFactory tyreFactory = new TyreFactory();
        Tyres tyres = tyreFactory.getTyre("Michelin");
        log.info(tyres.rotate());
    }

}