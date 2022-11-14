package com.rama.artemis.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class ArtemisProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(ArtemisProducer.class);
    private final JmsTemplate jmsTemplate;

    @Value("${jms.in.queue.destination}")
    String destinationQueue;

    public ArtemisProducer(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void send(String msg) {
        LOGGER.info("Sending Data:");
        jmsTemplate.convertAndSend(destinationQueue, msg);
        LOGGER.info("Data Sent:");
    }
}

