package com.chengzi.Test;

import com.chengzi.LinearList.LinkedList.LinkedList_Doubly;

public class LinkedList_DoublyTest {

    public static void main(String[] args){
        LinkedList_Doubly<Integer> list=new LinkedList_Doubly<>();
        list.addFirst(7);
        list.addFirst(6);
        list.addFirst(5);
        list.addFirst(3);
        list.addFirst(1);
        System.out.println(list);
        list.addLast(10);
        System.out.println(list);
        list.add(1,22);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}
