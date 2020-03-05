package com.chengzi.Test;

import com.chengzi.LinearList.LinkedList.LinkedList_Single;

public class LinkedList_SingleTest {
    public static void main(String[] args){
        LinkedList_Single<Integer> linkedList=new LinkedList_Single<>();
        linkedList.addFirst(1);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.addFirst(5);
        linkedList.addFirst(6);
        System.out.println(linkedList);
        linkedList.add(1,2);
        linkedList.addLast(15);
        System.out.println(linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.remove(1);
        System.out.println(linkedList);

        LinkedList_Single<Integer> list1=new LinkedList_Single<>();
        LinkedList_Single<Integer> list2=new LinkedList_Single<>();
        list1.addLast(1);
        list1.addLast(3);
        list1.addLast(5);
        list1.addLast(7);
        list2.addLast(2);
        list2.addLast(4);
        list2.addLast(5);
        list2.addLast(6);
        list2.addLast(8);
        list2.addLast(10);
        LinkedList_Single<Integer> list3=LinkedList_Single.connect(list1,list2);
        System.out.println("链表1："+list1);
        System.out.println("链表2："+list2);
        System.out.println("连接后的链表："+list3);
    }
}
