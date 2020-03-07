package com.chengzi.Tree;

public class TNode<T> {
    public T data;//数据域
    public TNode<T> lchild;//左子树
    public TNode<T> rchild;//右子树

    public TNode(){
        this(null);
    }
    public TNode(T data){
        this(data,null,null);
    }
    public TNode(T data,TNode lchild,TNode rchild){
        this.data=data;
        this.lchild=lchild;
        this.rchild=rchild;
    }
}
