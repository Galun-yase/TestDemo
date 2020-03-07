package com.chengzi.Tree;

import java.util.Arrays;

public class SequenceTree<T> {
    private T[] array;

    public SequenceTree(){
        this.array=(T[])new Object[1000];
    }

    //初始化带根节点的树
    public SequenceTree(T data){
        this();
        array[1]=data;
    }

    //为指定节点增加子节点
    public void add(int index,T data,boolean isLeft){
        if (array[index]==null){
            throw new RuntimeException("非法插入");
        }
        if (index*2>=array.length||index*2+1>=array.length){
            throw new RuntimeException("树底层数组已满，无法插入");
        }
        if (isLeft){
            array[index*2]=data;
        }else {
            array[index*2+1]=data;
        }
    }
    @Override
    public String toString(){
        return Arrays.toString(array);
    }
}
