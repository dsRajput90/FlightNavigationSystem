package com.dsr.fns.service;

import java.util.concurrent.BlockingQueue;

public class PublisherService implements Runnable {
    BlockingQueue<Message> queues;
    PushMessageService pushMessageService;

    PublisherService(BlockingQueue queues,PushMessageService pushMessageService){
        this.queues=queues;
        this.pushMessageService=pushMessageService;
    }

    public void run(){

    }
}
