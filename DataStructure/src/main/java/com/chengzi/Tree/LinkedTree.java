package com.chengzi.Tree;


import com.chengzi.LinearList.LinkedList.Node;
import com.chnegzi.Queue.SequenceQueue;

import java.util.Queue;

public class LinkedTree<T> {
    public TNode<T> head;//头指针

    public LinkedTree(){
        head=null;
    }
    public LinkedTree(T data){
        this(data,null,null);
    }
    public LinkedTree(T data, TNode<T> lchild, TNode<T> rchild){
        head=new TNode<T>(data,lchild,rchild);
    }

    //得到树的根节点
    public TNode<T> getRoot(){
        return head;
    }

    //增加左节点
    public void addLeft(TNode<T> node,T data){
        TNode<T> tempnode=new TNode<>(data);
        tempnode.lchild=node.lchild;
        node.lchild=tempnode;
    }

    //增加右节点
    public void addRight(TNode<T> node,T data){
        TNode<T> tempnode=new TNode<>(data);
        tempnode.rchild=node.rchild;
        node.rchild=tempnode;
    }

    @Override
    public String toString(){
        SequenceQueue<TNode<T>> queue=new SequenceQueue<>();
        StringBuilder sb=new StringBuilder();
        TNode<T> p=head;
        if (p!=null){
            queue.push(p);
        }
        while (!queue.isEmpty()){
            TNode<T> node=queue.pop();
            sb.append(node.data).append(" ");
            if (node.lchild!=null){
                queue.push(node.lchild);
            }
            if(node.rchild!=null){
                queue.push(node.rchild);
            }
        }
        return sb.toString();
    }

    //判空
    private boolean isEmpty(){
        return head==null;
    }
}
