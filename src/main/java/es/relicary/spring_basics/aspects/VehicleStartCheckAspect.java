package es.relicary.spring_basics.aspects;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
@Log4j2
public class VehicleStartCheckAspect {

    @Before("execution(* es.relicary.spring_basics.services.*.*(..)) && args(vehicleStarted,..)")
    public void checkVehicleStarted(JoinPoint joinPoint, boolean vehicleStarted) throws Throwable {
        if(!vehicleStarted) {
            log.error("Vehicle not started to perform the operation: {}", joinPoint.getSignature().toString());
        }
    }

}