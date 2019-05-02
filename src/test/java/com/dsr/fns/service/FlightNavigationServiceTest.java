package com.dsr.fns.service;

import org.junit.Test;
import sun.nio.ch.ThreadPool;

public class FlightNavigationServiceTest {
    @Test
    public void testService(){
        FlightNavigationService service = new FlightNavigationService();
        service.startPubSub();
        service.addMessage(new Message("land",2));
        service.addMessage(new Message("takeoff",1));
        service.addMessage(new Message("takeoff",1));
        service.addMessage(new Message("land",2));
        service.addMessage(new Message("land",2));
        service.addMessage(new Message("delay",5));
        service.addMessage(new Message("takeoff",1));
        service.addMessage(new Message("delay",5));
        service.addMessage(new Message("delay",5));
        service.addMessage(new Message("takeoff",1));

        for(int i =0;i<10;i++){

        }

    }
}
