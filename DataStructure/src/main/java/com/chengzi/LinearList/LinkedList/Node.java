package com.chengzi.LinearList.LinkedList;

//声明链表节点
public class Node<T> {
    public T data;      //数据域
    public Node<T> next;//地址域

    public Node(){
        this.data=null;
        this.next=null;
    }

    public Node(T data,Node<T> next){
        this.data=data;
        this.next=next;
    }
}
