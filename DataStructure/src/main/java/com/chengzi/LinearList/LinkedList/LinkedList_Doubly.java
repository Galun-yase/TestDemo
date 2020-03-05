package com.chengzi.LinearList.LinkedList;

import java.awt.dnd.DnDConstants;

public class LinkedList_Doubly<T> {
    private int size;
    DNode<T> header;
    public LinkedList_Doubly(){
        this.size=0;
        this.header=new DNode<>();
    }

    //在双链表头部插入元素
    public void addFirst(T data){
        DNode<T> newNode=new DNode<>();
        newNode.data=data;
        if (header.next==null){
            header.next=newNode;
        }else {
            header.next.prev=newNode;
            newNode.next=header.next;
            header.next=newNode;
        }
        size+=1;
    }

    //在双链表特定位置插入元素
    public void add(int index,T data){
        rangeCheckForAdd(index);
        if (index==0){
            addFirst(data);
        }else if(index==size){
            addLast(data);
        }else{
            DNode<T> newNode=new DNode<>();
            newNode.data=data;
            DNode<T> p=findPreNode(index);
            newNode.next=p.next;
            newNode.prev=p;
            p.next.prev=newNode;
            p.next=newNode;
            size+=1;

        }
    }

    //在双链表末尾插入元素
    public void addLast(T data){
        DNode<T> p=findPreNode(size);//找到最后一个节点
        DNode<T> newNode=new DNode<>();
        newNode.data=data;
        p.next=newNode;
        newNode.prev=p;
        size+=1;
    }

    //删除双向链表第一个节点
    public void removeFirst(){
        if (header.next==null){
            throw new RuntimeException("删除失败，链表为空");
        }
        if (size==1){
            removeOnlyNode();
        }else {
            DNode<T> p=header.next;
            header.next=p.next;
            p.next.prev=null;
            p.next=null;
            size-=1;
        }
    }

    //删除双向链表特定位置的节点
    public void remove(int index){
        if (header.next==null){
            throw new RuntimeException("删除失败，链表为空");
        }
        rangeCheckForRemove(index);
        if (size==1){
            removeOnlyNode();
            return;
        }
        if (index==0){
            removeFirst();
        }else if(index==size-1){
            removeLast();
        }else {
            DNode<T> p=findPreNode(index);
            DNode<T> q=p.next;
            p.next=q.next;
            q.next.prev=p;
            q.next=null;
            q.prev=null;
            size-=1;
        }
    }

    //删除双向链表最后一个节点
    public void removeLast(){
        if (header.next==null){
            throw new RuntimeException("删除失败，链表为空");
        }
        if (size==1){
            removeOnlyNode();
        }else {
            DNode<T> p=findPreNode(size-1);
            p.next.prev=null;
            p.next=null;
            size-=1;
        }
    }

    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        DNode<T> node=header.next;
        while (node!=null){
            sb.append(node.data).append(" ");
            node=node.next;
        }
        return sb.toString();
    }

    //找到特定节点的前一个节点
    private DNode<T> findPreNode(int index){
        DNode<T> p=header;
        for (int i=0;i<index;i++){
            p=p.next;
        }
        return p;
    }
    //检查插入位置是否合法
    private void rangeCheckForAdd(int index){
        if(index<0||index>size){
            throw new IndexOutOfBoundsException("插入位置不合法");
        }
    }
    //检查删除位置是否合法
    private void rangeCheckForRemove(int index){
        if (index<0||index>size-1){
            throw new IndexOutOfBoundsException("删除位置不合法");
        }
    }
    //删除唯一一个元素
    private void removeOnlyNode(){
        header.next=null;
        size-=1;
    }


}
 class DNode<T>{
    public T data;
    public  DNode<T> prev;
    public  DNode<T> next;

    public DNode(){
        this.data=null;
        this.prev=null;
        this.next=null;
    }
}
