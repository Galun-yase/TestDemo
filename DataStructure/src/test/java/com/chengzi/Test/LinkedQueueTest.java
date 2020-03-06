package com.chengzi.Test;

import com.chnegzi.Queue.LinkedQueue;

public class LinkedQueueTest {
    public static void main(String[] args){
        LinkedQueue<Integer> lqueue=new LinkedQueue<>();
        lqueue.push(1);
        lqueue.push(2);
        lqueue.push(3);
        lqueue.push(4);
        System.out.println(lqueue);
        lqueue.pop();
        System.out.println(lqueue);
    }
}
