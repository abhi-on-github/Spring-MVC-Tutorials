package com.abhishek.springrabbitmqconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @RabbitListener(queues = MQConfig.QUEUE)
    public void consumeMessage(CustomMessage message){
        System.out.println(message);
    }
}
