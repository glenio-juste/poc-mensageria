package com.juste.poc.mensageria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;


@Component
public class FileSender {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    public void send(String message) {
        this.jmsMessagingTemplate.convertAndSend(this.queue, message);
    }

}
