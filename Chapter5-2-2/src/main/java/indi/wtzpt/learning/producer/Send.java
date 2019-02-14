package indi.wtzpt.learning.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class Send {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void process() {
        Map<Object,Object> map = new HashMap<>();
        map.put("path","D://data//wqeqwewq");
        map.put("url","http:213131.zip");
        rabbitTemplate.convertAndSend("test",map);
    }
}
