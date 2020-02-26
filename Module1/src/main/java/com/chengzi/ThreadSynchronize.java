package com.chengzi;

import org.w3c.dom.css.Counter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSynchronize {

    public static void main(String[] args)throws InterruptedException{

        AddThread add=new AddThread();
        DecThread dec=new DecThread();
        ExecutorService x = Executors.newFixedThreadPool(3);


        add.start();
        dec.start();
        add.join();
        dec.join();

        System.out.println(AddThread.count);

    }
}


class  AddThread extends Thread {
    public static volatile int count=0;
    public void run() {
        for (int i=0; i<10000; i++) { count += 1; }
    }
}

class DecThread extends Thread {
    public void run() {
        for (int i=0; i<10000; i++) { AddThread.count -= 1; }
    }
}

