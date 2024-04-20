package es.relicary.spring_basics.aspects;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;

@Aspect
@Component
@Order(2)
@Log4j2
public class LoggerAspect {

    @Around("execution(* es.relicary.spring_basics.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {

        log.info("{} method execution start", joinPoint.getSignature().toString());

        Instant start = Instant.now();
        joinPoint.proceed();
        Instant finish = Instant.now();

        long timeElapssed = Duration.between(start, finish).toMillis();
        log.info("Time took to execute the method: {}", timeElapssed);

        log.info("{} method execution end", joinPoint.getSignature().toString());
    }
}