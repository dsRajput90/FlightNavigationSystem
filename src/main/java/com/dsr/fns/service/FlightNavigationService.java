package com.dsr.fns.service;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class FlightNavigationService {

    /**
     * Method which accepts calls the publisher and consumer and
     *
     * **/
    BlockingQueue queue = new PriorityBlockingQueue(5, new MessageComparator());
    PushMessageService pushMessageService = new PushMessageService(queue);

    ConsumerService consumer = new ConsumerService(queue, pushMessageService);
    PublisherService publisherService = new PublisherService(queue, pushMessageService);

    public void startPubSub(){

        Thread t1 = new Thread(consumer);
        Thread t2 = new Thread(publisherService);
        t1.start();
        t2.start();
    }

    public void addMessage(Message message){
        pushMessageService.addMsgToQueue(message);
    }
}
