package de.erdlet.camunda.multimodule.hello.adapters.rest;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private final RuntimeService runtimeService;

    @Autowired
    public HelloController(final RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PostMapping(consumes = "text/plain")
    public void sayHello(@RequestBody final String name) {
        runtimeService.startProcessInstanceByKey("hello", Map.of("name", name));
    }

}
