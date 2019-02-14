package indi.wtzpt.learning.consumer;

import indi.wtzpt.learning.Chapter522ApplicationTests;
import indi.wtzpt.learning.producer.Send;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class ReceiverTest extends Chapter522ApplicationTests {

    @Autowired
    private Send send;

    @Test
    public void process() {
        send.process();
    }
}