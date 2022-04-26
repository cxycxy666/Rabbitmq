package com.cxy.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RabbitListener(queues = "logOper")
public class LogConsumer {


    @RabbitHandler
    public void process(Integer logOper) {
        log.info("Receiver logOper : " + logOper);
        System.out.println((logOper));
    }


}
