package com.chengzi.Stack;

public class StackNode<T> {
    public T data;
    public StackNode<T> next;

    public  StackNode(){}
    public StackNode(T data){
        this.data=data;
        this.next=null;
    }
}
