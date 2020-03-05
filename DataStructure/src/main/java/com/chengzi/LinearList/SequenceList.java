package com.chengzi.LinearList;

public class SequenceList<T> {
    private T[] seqList;
    private int size;
    public SequenceList(){
        this.seqList= (T[]) new Object[1000];
        this.size=0;
    }
    //在顺序表末尾插入元素
    public boolean add(T element){
        if (size<seqList.length){
            seqList[size]=element;
            size+=1;
            return true;
        } else{
            return false;
        }
    }
    //在顺序表特定位置插入元素
    public boolean add(int index,T element){
        rangeCheckForAdd(index);
        for (int i = size; i >index ; i--) {
            seqList[i]=seqList[i-1];
        }
        seqList[index]=element;
        size+=1;
        return true;
    }
    //在顺序表特定位置删除元素
    public boolean remove(int index){
        rangeCheckForRemove(index);
        for(int i=index;i<size-1;i++){
            seqList[i]=seqList[i+1];
        }
        size-=1;
        return true;
    }

    //顺序表大小
    public int getSize(){
        return size;
    }

    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<size;i++){
            sb.append(seqList[i]).append(" ");
        }
        return sb.toString();
    }


    //判断插入位置是否合法
    private void rangeCheckForAdd(int index){
        if (index<0 || index>this.size){
            throw new IndexOutOfBoundsException("插入位置不合法");
        }
    }
    //判断删除位置是否合法
    private void rangeCheckForRemove(int index){
        if(index<0 ||index>=size){
            throw new IndexOutOfBoundsException("删除位置不合法");
        }
    }
}
