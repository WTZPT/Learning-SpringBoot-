package indi.wtzpt.learning.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RabbitListener(queues = "test")
public class Receiver {
    @RabbitHandler
    public void process(Map<Object, Object> o) {
        System.out.println("Receiver : " + o.toString());
    }
}
