package es.relicary.spring_basics.examples;

import es.relicary.spring_basics.config.ProjectConfig;
import es.relicary.spring_basics.model.Song;
import es.relicary.spring_basics.services.VehicleService;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Log4j2
public class Example {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        VehicleService vehicleService = context.getBean(VehicleService.class);
        log.info(vehicleService.getClass());

        Song song = new Song("Two's up", "Brian Johnson");

        boolean vehicleStarted = true;

        String moveVehicleStatus = vehicleService.moveVehicle(vehicleStarted);
        String playMusicStatus = vehicleService.playMusic(vehicleStarted, song);
        String applyBrakeStatus = vehicleService.applyBreak(vehicleStarted);

    }
}