package com.chengzi.Stack;

public class LinkedStack<T> implements IStack<T>{

    private StackNode<T> top;
    private int size;

    public LinkedStack(){
        top=new StackNode<>();
        size=0;
    }

    @Override
    public T push(T data) {
        StackNode<T> newNode=new StackNode<>(data);
        if (!isEmpty()){
            newNode.next=top.next;
        }
        top.next=newNode;
        size+=1;
        return data;
    }

    @Override
    public T pop() {
        T item=null;
        if (!isEmpty()){
            item=top.next.data;
            top.next=top.next.next;
            size-=1;
        }
        return item;
    }

    @Override
    public T peek() {
        T item=null;
        if (!isEmpty()){
            item=top.next.data;
        }
        return item;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (top==null && size==0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        StackNode<T> node=top.next;
        while (node!=null){
            sb.append(node.data).append(" ");
            node=node.next;
        }
        return sb.toString();
    }
}
