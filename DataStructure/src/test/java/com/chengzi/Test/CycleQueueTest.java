package com.chengzi.Test;

import com.chnegzi.Queue.CycleQueue;

public class CycleQueueTest {
    public static void main(String[] args){
        CycleQueue<String> cqueue=new CycleQueue<>();
        cqueue.push("a");
        cqueue.push("b");
        cqueue.push("c");
        System.out.println(cqueue);
        cqueue.pop();
        cqueue.pop();
        System.out.println(cqueue);
        cqueue.push("a");
        cqueue.push("b");
        System.out.println(cqueue);
        cqueue.pop();
        cqueue.pop();
        cqueue.pop();
        cqueue.pop();
    }
}
