package com.dsr.fns.service;

import java.util.concurrent.BlockingQueue;

/**
 * Create a priority queue which will add all the values and you need to process msg before they expire
 * msg types: Land - 1sec
 * Takeoff-2sec
 * Delay-5sec
 * After these msgs will be dropped
 * **/
public class PushMessageService {

    BlockingQueue<Message> messages;

    PushMessageService(BlockingQueue queue){
        this.messages= queue;
    }

    public void addMsgToQueue(Message msg){
        messages.add(msg);
    }
}
