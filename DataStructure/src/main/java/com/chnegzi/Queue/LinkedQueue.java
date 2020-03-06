package com.chnegzi.Queue;

import com.chengzi.LinearList.LinkedList.Node;

public class LinkedQueue<T> {
    private int size;
    Node<T> front;
    Node<T> rear;

    public LinkedQueue(){
        this.size=0;
        this.front=new Node<>();
        this.rear=null;
    }

    //入队
    public void push(T data){
        Node<T> newNode=new Node<>();
        newNode.data=data;
        if (isEmpty()){
            this.front.next=newNode;
        }else {
            this.rear.next=newNode;
        }
        this.rear=newNode;
        size+=1;
    }

    //出队
    public T pop(){
        if (isEmpty()){
            throw new RuntimeException("出队失败，队空");
        }
        T data=this.front.next.data;
        if (size==1){
            this.front.next=null;
            this.rear=null;
            size-=1;
        }else {
            Node<T> node=this.front.next;
            this.front.next=node.next;
            node.next=null;
            size-=1;
        }
        return data;
    }

    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        Node<T> node=this.front.next;
        while (node!=null){
            sb.append(node.data).append(" ");
            node=node.next;
        }
        return sb.toString();
    }

    //判空
    private boolean isEmpty(){
        return this.front.next==null && this.rear==null;
    }

}
