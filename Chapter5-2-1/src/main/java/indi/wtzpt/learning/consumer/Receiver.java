package indi.wtzpt.learning.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "test")
public class Receiver {
    @RabbitHandler
    public void process(String content) {
        System.out.println("Receiver : " + content);
    }
}
