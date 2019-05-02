package com.dsr.fns.service;

import java.util.Comparator;

public class MessageComparator implements Comparator<Message> {
    public int compare(Message s1, Message s2) {
        if (s1.priority < s2.priority)
            return 1;
        else if (s1.priority > s2.priority)
            return -1;
        return 0;
    }
}
