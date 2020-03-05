package com.chengzi.Test;

import com.chengzi.LinearList.LinkedList.LinkedList_Cycle;

public class LinkedList_CycleTest {

    public static void main(String[] aegs){
        LinkedList_Cycle<Integer> list=new LinkedList_Cycle<>();
        list.addFirst(7);
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(1);
        System.out.println(list);
        list.add(1,15);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}
