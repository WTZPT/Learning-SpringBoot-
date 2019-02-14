package indi.wtzpt.learning.Producer;

import indi.wtzpt.learning.Chapter521ApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class sendTest extends Chapter521ApplicationTests {

    @Autowired
    private  send send;
    @Test
    public void process() {
        send.process();
    }
}