package com.chengzi.LinearList.LinkedList;

public class LinkedList_Single<T> {
    private int size;//链表大小
    Node<T> header;//链表的头结点
    public LinkedList_Single(){
        header=new Node<>();
        size=0;
    }

    //在链表的头部插入节点
    public void addFirst(T data){
        Node<T> newNode=new Node<>();
        newNode.data=data;
        newNode.next=header.next;
        header.next=newNode;
        size+=1;
    }

    //在链表的指定位置插入节点
    public void add(int index,T data){
        rangeCheckForAdd(index);
        if (index==0){
            addFirst(data);
        }else if (index==size){
            addLast(data);
        }else{
            Node<T> newNode=new Node<>();
            Node<T> p=findPreNode(index);
            newNode.next=p.next;
            p.next=newNode;
            newNode.data=data;
            size+=1;

        }
    }

    //在链表的尾部插入节点
    public void addLast(T data){
        Node<T> newNode=new Node<>();
        Node<T> p=findPreNode(size);
        p.next=newNode;
        newNode.data=data;
        size+=1;
    }

    //删除链表的第一个节点
    public void removeFirst(){
        if (header.next==null){
            throw new RuntimeException("删除失败，链表为空");
        }
        Node<T> p=header.next;
        header.next=p.next;
        p.next=null;//回收p内存
        size-=1;
    }

    //删除链表的指定位置的节点
    public void remove(int index){
        rangeCheckForRemove(index);
        if (header.next==null){
            throw new RuntimeException("删除失败，链表为空");
        }
        if (index==0){
            removeFirst();
        }else if (index==size-1){
            removeLast();
        }else{
            Node<T> p=findPreNode(index);
            Node<T> q=p.next;
            p.next=q.next;
            q.next=null;//收回q的内存
            size-=1;
        }
    }

    //删除链表的最后一个节点
    public void removeLast(){
        if (header.next==null){
            throw new RuntimeException("删除失败，链表为空");
        }
        Node<T> p=findPreNode(size-1);
        Node<T> q=p.next;
        p.next=q.next;
        q.next=null;
        size-=1;
    }

    //连接两个链表
    public static LinkedList_Single<Integer> connect(LinkedList_Single<Integer> list1,LinkedList_Single<Integer> list2){
        Node<Integer> pa=list1.header.next;
        Node<Integer> pb=list2.header.next;
        LinkedList_Single<Integer> pc=new LinkedList_Single<>();
        while (pa!=null&&pb!=null){
            if (pa.data>=pb.data){
                pc.addLast(pb.data);
                pb=pb.next;
            }else {
                pc.addLast(pa.data);
                pa=pa.next;
            }
        }
        while (pa!=null){
            pc.addLast(pa.data);
            pa=pa.next;
        }
        while (pb!=null){
            pc.addLast(pb.data);
            pb=pb.next;
        }
        return pc;
    }

    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        Node<T> node=header.next;
        while (node!=null){
            sb.append(node.data.toString()).append(" ");
            node=node.next;
        }
        return sb.toString();
    }

    //判断插入位置是否合法
    private void rangeCheckForAdd(int index){
        if(index<0||index>size){
            throw new IndexOutOfBoundsException("插入位置不合法");
        }
    }

    //判断删除位置是否合法
    private void rangeCheckForRemove(int index){
        if (index<0||index>size-1){
            throw new IndexOutOfBoundsException("删除位置不合法");
        }
    }

    //找到特定位置前的节点
    private Node<T> findPreNode(int index){
        Node<T> p=header;
        for (int i=0;i<index;i++){
            p=p.next;
        }
        return p;
    }
}
