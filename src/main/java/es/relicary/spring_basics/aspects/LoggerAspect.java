package es.relicary.spring_basics.aspects;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
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
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {

        log.info("{} \n\tMethod execution start", joinPoint.getSignature().toString());

        Instant start = Instant.now();
        Object result = joinPoint.proceed();
        Instant finish = Instant.now();

        long timeElapssed = Duration.between(start, finish).toMillis();
        log.info("Time took to execute the method: {}", timeElapssed);

        log.info("{} \n\tMethod execution end", joinPoint.getSignature().toString());

        return result;
    }

    @Around("@annotation(es.relicary.spring_basics.interfaces.CustomAspect)")
    public Object logWithAnnotation(ProceedingJoinPoint joinPoint) throws Throwable {

        log.info("{} \n\tmethod execution start (*)", joinPoint.getSignature().toString());

        Instant start = Instant.now();
        Object result = joinPoint.proceed();
        Instant finish = Instant.now();

        long timeElapssed = Duration.between(start, finish).toMillis();
        log.info("Time took to execute the method: {}", timeElapssed);

        log.info("{} \n\tmethod execution end (*)", joinPoint.getSignature().toString());

        return result;
    }

    @AfterThrowing(value = "execution( * es.relicary.spring_basics.services.*.*(..))", throwing = "ex")
    public void logException(JoinPoint joinPoint, Exception ex) {
        log.error("{} \n\tAn exception thrown with the help of @AfterThrowing which happened due to: {}", joinPoint.getSignature().toString(), ex.getMessage());
    }

    @AfterReturning(value = "execution( * es.relicary.spring_basics.services.*.*(..))", returning = "retVal")
    public void logStatus(JoinPoint joinPoint, Object retVal) {
        log.info("{} \n\tMethod successfully processed with the status: {}", joinPoint.getSignature().toString(), retVal.toString());
    }
}