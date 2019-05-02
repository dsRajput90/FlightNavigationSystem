package com.dsr.fns.service;

import java.util.concurrent.BlockingQueue;

public class ConsumerService implements Runnable{
    BlockingQueue<Message> queues;
    PushMessageService pushMessageService;

    ConsumerService(BlockingQueue queues,PushMessageService pushMessageService){
        this.queues=queues;
        this.pushMessageService=pushMessageService;
    }
    public void run(){

    }
}
