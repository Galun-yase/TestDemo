package com.chnegzi.Queue;

public class SequenceQueue<T> {
    private T[] array;
    private int front;//指向队列的头部（出队）
    private int rear;//指向队列的尾部（入队）
    private final int MaxSize=1000;//初始化为1000个容量

    public SequenceQueue(){
        this.array=(T[])new Object[MaxSize];
        this.front=-1;
        this.rear=-1;
    }

    //入队
    public void push(T data){
        if (isFull()){
            throw new RuntimeException("入队失败，队满");
        }else {
            this.rear+=1;
            this.array[rear]=data;
        }
    }

    //出队
    public T pop(){
        if (isEmpty()){
            throw new RuntimeException("出队失败，队空");
        }else {
            front+=1;
            T item=this.array[front];
            this.array[front]=null;//释放内存
            return item;
        }
    }

    //取队头
    public T peek(){
        if (isEmpty()){
            throw new RuntimeException("取头失败，队空");
        }else {
            return this.array[this.front+1];
        }
    }

    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        if (isEmpty()){
            return null;
        }else {
            for(int i=front+1;i<=rear;i++){
                sb.append(array[i]).append(" ");
            }
        }
        return sb.toString();
    }

    //判空
    public boolean isEmpty(){
        return this.front==this.rear;
    }
    //判满
    private boolean isFull(){
        if (this.rear+1>=MaxSize){
            return true;
        }else {
            return false;
        }
    }
}
