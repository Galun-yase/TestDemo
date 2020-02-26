package com.chengzi;

public class ThreadTest {
    public  static void main(String[] args){
        Thread t=new Thread(()->{
            System.out.println("hello");
        });
        t.start();

        try{
            Thread.sleep(1000);
            t.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
