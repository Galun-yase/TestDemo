package com.chengzi.Stack;


import java.lang.reflect.Array;

public class SequenceStack<T> implements IStack<T> {

    private int maxsize;
    private T[] array;
    private int top;

    public SequenceStack(int size){
        array= (T[]) new Object[size];
        maxsize=size;
        top=-1;
    }

    //入栈
    @Override
    public T push(T data) {
        if (!isFull()){
            top+=1;
            array[top]=data;
            return data;
        }else {
            throw  new IndexOutOfBoundsException("入栈失败，栈满");
        }
    }

    //出栈
    @Override
    public T pop() {
        if (!isEmpty()){
            T item=array[top];
            array[top]=null;
            top-=1;
            return item;
        }else {
            throw new RuntimeException("出栈失败，栈空");
        }
    }

    //取栈顶
    @Override
    public T peek() {
        if (!isEmpty()){
            return array[top];
        }else {
            return null;
        }
    }

    //栈内元素个数
    @Override
    public int getSize() {
        return top+1;
    }

    //判空
    @Override
    public boolean isEmpty() {
        if (top==-1){
            return true;
        }else{
            return false;
        }
    }

    //判满
    @Override
    public boolean isFull(){
        if (top==maxsize-1){
            return true;
        }else {
            return false;
        }
    }
    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        int t=0;
        while(array[t]!=null){
            sb.append(array[t]).append(" ");
            t+=1;
        }
        return sb.toString();
    }
}
