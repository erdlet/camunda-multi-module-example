package de.erdlet.camunda.multimodule.app;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("de.erdlet.camunda.multimodule")
@SpringBootApplication
@EnableProcessApplication
public class CamundaMultiModuleExample {

    public static void main(String[] args) {
        SpringApplication.run(CamundaMultiModuleExample.class, args);
    }
}
