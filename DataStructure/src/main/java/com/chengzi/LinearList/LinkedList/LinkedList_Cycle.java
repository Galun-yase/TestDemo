package com.chengzi.LinearList.LinkedList;

public class LinkedList_Cycle<T> {
    Node<T> header;
    private int size;

    public LinkedList_Cycle(){
        header=new Node<>();
        header.next=header;//链表为空的条件
        size=0;
    }

    public boolean isEmpty(){
        return header.next==header;
    }

    //在循环链表头部插入元素
    public void addFirst(T data){
        Node<T> newNode=new Node<>();
        newNode.data=data;
        newNode.next=header.next;
        header.next=newNode;
        size+=1;
    }
    //在循环链表指定位置插入元素(实现了在末尾插入)
    public void add(int index,T data){
        rangeCheckForAdd(index);
        if (index==0){
            addFirst(data);
        }else {
            Node<T> newNode=new Node<>();
            Node<T> p=findPreNode(index);
            newNode.next=p.next;
            newNode.data=data;
            p.next=newNode;
            size+=1;
        }
    }

    //删除循环链表的第一个元素
    public void removeFirst(){
        if (header.next==header){
            throw new RuntimeException("删除失败，链表为空");
        }
        Node<T> p=header.next;
        header.next=p.next;
        p.next=null;
        size-=1;
    }

    //删除循环链表的特定位置元素(实现了删除末尾元素）
    public void remove(int index){
        rangeCheckForRemove(index);
        if (header.next==header){
            throw new RuntimeException("删除失败，链表为空");
        }
        if (index==0){
            removeFirst();
        }else {
            Node<T> p=findPreNode(index);
            Node<T> q=p.next;
            p.next=q.next;
            q.next=null;
            size-=1;
        }
    }

    @Override
    public  String toString(){
        StringBuilder sb=new StringBuilder();
        Node<T> node= header.next;
        while(node!=header){
            sb.append(node.data).append(" ");
            node=node.next;
        }
        return sb.toString();
    }

    //判断插入位置是否合法
    private void rangeCheckForAdd(int index){
        if (index<0||index>size){
            throw new IndexOutOfBoundsException("插入位置不合适");
        }
    }

    //判断删除位置是否合法
    private void rangeCheckForRemove(int index){
        if (index<0||index>size-1){
            throw new IndexOutOfBoundsException("删除位置不合法");
        }
    }

    //找到指定位置前的节点
    private Node<T> findPreNode(int index){
        Node<T> p=header;
        for (int i=0;i<index;i++){
            p=p.next;
        }
        return p;
    }
}
