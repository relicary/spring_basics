package es.relicary.spring_basics.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "es.relicary.spring_basics.beans")
public class ProjectConfig {

}