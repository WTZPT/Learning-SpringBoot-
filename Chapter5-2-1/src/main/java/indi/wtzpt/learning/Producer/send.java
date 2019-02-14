package indi.wtzpt.learning.Producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class send {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void process(){
        for (int i = 0 ; i < 10; i++) {
            String txt =  "Hello RabbitMQ  " + i;
            System.out.println("Sender : " + txt);
            this.rabbitTemplate.convertAndSend("test",txt);
        }

    }
}
