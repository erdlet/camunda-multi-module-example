package de.erdlet.camunda.multimodule.goodbye.adapters.rest;

import java.util.Map;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goodbye")
public class GoodbyeController {

    private final RuntimeService runtimeService;

    @Autowired
    public GoodbyeController(final RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    @PostMapping(consumes = "text/plain")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void sayGoodbye(@RequestBody final String name) {
        runtimeService.startProcessInstanceByKey("goodbye", Map.of("name", name));
    }
}
