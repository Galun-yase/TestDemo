package com.chengzi.Test;

import com.chnegzi.Queue.SequenceQueue;

public class SequenceQueueTest {
    public static void main(String[] args){
        SequenceQueue<String> squeue=new SequenceQueue<>();
        squeue.push("a");
        squeue.push("b");
        squeue.push("c");
        squeue.push("d");
        System.out.println(squeue);
        squeue.pop();
        System.out.println(squeue);
        System.out.println(squeue.peek());
    }
}
