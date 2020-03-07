package com.chengzi.Tree;

import com.chengzi.Stack.SequenceStack;
import com.chnegzi.Queue.SequenceQueue;

public class TraversingTree<T> {

    //二叉树的先序遍历递归实现
    public void preOrderByRecursion(TNode<T> root){
        if (root!=null){
            System.out.print(root.data+" ");
            preOrderByRecursion(root.lchild);
            preOrderByRecursion(root.rchild);
        }
    }
    //先序遍历非递归实现
    public void preOrderByNotRecursion(TNode<T> root){
        SequenceStack<TNode<T>> stack=new SequenceStack<>(100);
        TNode<T> temp=root;
        while (temp!=null||!stack.isEmpty()){
            while (temp!=null){
                System.out.print(temp.data+" ");
                stack.push(temp);
                temp=temp.lchild;
            }
            if (!stack.isEmpty()){
                temp=stack.pop();
                temp=temp.rchild;
            }
        }
    }

    //中序遍历递归实现
    public void inOrderByRecursion(TNode<T> root){
        if (root!=null){
            inOrderByRecursion(root.lchild);
            System.out.print(root.data+" ");
            inOrderByRecursion(root.rchild);
        }
    }
    //中序遍历非递归实现
    public void inOrderByNotRecursion(TNode<T> root){
        SequenceStack<TNode<T>> stack=new SequenceStack<>(100);
        TNode<T> temp=root;
        while (temp!=null||!stack.isEmpty()){
            while (temp!=null){
                stack.push(temp);
                temp=temp.lchild;
            }
            if (!stack.isEmpty()){
                temp=stack.pop();
                System.out.print(temp.data+" ");
                temp=temp.rchild;
            }
        }
    }

    //后序遍历递归实现
    public void postOrderByRecursion(TNode<T> root){
        if (root!=null){
            postOrderByRecursion(root.lchild);
            postOrderByRecursion(root.rchild);
            System.out.print(root.data+" ");
        }
    }
    //后序遍历非递归实现
    public void postOrderByNotRecursion(TNode<T> root){
        SequenceStack<TNode<T>> stack=new SequenceStack<>(10);
        SequenceStack<TNode<T>> tempstack=new SequenceStack<>(10);
        TNode<T> temp=root;
        while (temp!=null||!stack.isEmpty()){
            while (temp!=null){
                tempstack.push(temp);
                stack.push(temp);
                temp=temp.rchild;
            }
            if (!stack.isEmpty()){
                temp=stack.pop();
                temp=temp.lchild;
            }
        }
        while (!tempstack.isEmpty()){
            temp=tempstack.pop();
            System.out.print(temp.data+" ");
        }
    }

    //二叉树层次遍历
    public void levelOrder(TNode<T> root){
        SequenceQueue<TNode<T>> queue=new SequenceQueue<>();
        if (root!=null){
            queue.push(root);
        }
        while (!queue.isEmpty()){
            TNode<T> temp=queue.pop();
            System.out.print(temp.data+" ");
            if (temp.lchild!=null){
                queue.push(temp.lchild);
            }
            if (temp.rchild!=null){
                queue.push(temp.rchild);
            }
        }
    }

}
