package de.erdlet.camunda.multimodule.hello.process.tasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloTask implements JavaDelegate {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloTask.class);

    @Override
    public void execute(final DelegateExecution execution) throws Exception {
        LOGGER.info("Hello {}!", execution.getVariable("name"));
    }
}
