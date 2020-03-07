package com.chengzi.Test;

import com.chengzi.Tree.LinkedTree;
import com.chengzi.Tree.TraversingTree;

public class LinkedTreeTest {
    public static void main(String[] args){
        LinkedTree<String> ltree=new LinkedTree<>("A");
        ltree.addLeft(ltree.getRoot(),"B") ;
        ltree.addRight(ltree.getRoot(),"C");
        ltree.addLeft(ltree.getRoot().lchild,"D");
        ltree.addLeft(ltree.getRoot().rchild,"E");
        ltree.addRight(ltree.getRoot().rchild,"F");
        System.out.println(ltree);


        System.out.println("非递归遍历栈实现：");
        TraversingTree traversing=new TraversingTree();
        System.out.print(" 先序遍历递归实现:");
        traversing.preOrderByRecursion(ltree.getRoot());
        System.out.println();
        System.out.print(" 先序遍历非递实现:");
        traversing.preOrderByNotRecursion(ltree.getRoot());

        System.out.println();
        System.out.print(" 中序遍历递归实现:");
        traversing.inOrderByRecursion(ltree.getRoot());
        System.out.println();
        System.out.print(" 中序遍历非递实现:");
        traversing.inOrderByNotRecursion(ltree.getRoot());

        System.out.println();
        System.out.print(" 后序遍历递归实现:");
        traversing.postOrderByRecursion(ltree.getRoot());
        System.out.println();
        System.out.print(" 后序遍历非递实现:");
        traversing.postOrderByNotRecursion(ltree.getRoot());

        System.out.println();
        System.out.println();
        System.out.print("层次遍历队列实现:");
        traversing.levelOrder(ltree.getRoot());
    }
}
