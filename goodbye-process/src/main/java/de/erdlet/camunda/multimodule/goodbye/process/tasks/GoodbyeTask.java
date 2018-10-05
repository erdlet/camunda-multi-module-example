package de.erdlet.camunda.multimodule.goodbye.process.tasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class GoodbyeTask implements JavaDelegate {

    private static final Logger LOGGER = LoggerFactory.getLogger(GoodbyeTask.class);

    @Override
    public void execute(final DelegateExecution execution) throws Exception {
        LOGGER.info("Goodbye {}!", execution.getVariable("name"));
    }
}
