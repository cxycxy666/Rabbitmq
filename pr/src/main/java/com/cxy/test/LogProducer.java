package com.cxy.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogProducer {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    @Autowired
    private AmqpTemplate amqpTemplate;
    @RequestMapping("/a")
    public void send() {
        log.info("Sender logOper: " + 1);
        amqpTemplate.convertAndSend("logOper", 1);
    }


}
