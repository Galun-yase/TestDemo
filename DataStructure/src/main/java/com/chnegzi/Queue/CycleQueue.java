package com.chnegzi.Queue;

public class CycleQueue<T> {
    private static final int MaxSize=4;
    private T[] array;
    private int front;
    private int rear;

    public CycleQueue(){
        this.array= (T[]) new Object[MaxSize];
        this.front=0;
        this.rear=0;
    }

    //入队
    public void push(T data){
        if(isFull()){
            throw new RuntimeException("入队失败，队列已满");
        }else {
            rear=(rear+1)%MaxSize;
            array[rear]=data;
        }
    }
    //出队
    public T pop(){
        if (isEmpty()){
            throw new RuntimeException("出队失败，队列为空");
        }else {
            front=(front+1)%MaxSize;
            return array[front];
        }
    }

    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        if (!isEmpty()){
            for (int i=1;i<=(rear-front+MaxSize)%MaxSize;i++){
                sb.append(array[(front+i)%MaxSize]).append(" ");
            }
        }
        return sb.toString();
    }

    //判空
    private boolean isEmpty(){
        if(rear==front){
            return true;
        }else{
            return false;
        }
    }
    //判满
    private boolean isFull(){
        if((rear+1)%MaxSize==front){
            return true;
        }else {
            return false;
        }
    }
}
