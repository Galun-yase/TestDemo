package com.chengzi.Tree;

import com.chnegzi.Queue.SequenceQueue;

class BSTNode{
    int data;
    BSTNode lchild;
    BSTNode rchild;
    public BSTNode(int data){
        this.data=data;
        this.lchild=null;
        this.rchild=null;
    }
}

public class BinarySortTree {
    //二叉排序树的构造算法
    public static BSTNode insertNode(BSTNode root,int data){
        if (root==null){
            return new BSTNode(data);
        }else if (data<root.data){
            root.lchild=insertNode(root.lchild,data);
        }else {
            root.rchild=insertNode(root.rchild,data);
        }
        return root;
    }

    //二叉排序树的查找算法
    public static boolean searchBSTNode(BSTNode root,int data){
        if (root==null){
            return false;
        }
        if (data==root.data){
            return true;
        }else if(data<root.data){
            return searchBSTNode(root.lchild,data);
        }else {
            return searchBSTNode(root.rchild,data);
        }
    }

    //二叉排序树的最小节点
    public static BSTNode findMin(BSTNode root){
        while (root.lchild!=null){
            root=root.lchild;
        }
        return root;
    }

    //二叉排序树的删除算法
    public static BSTNode removeBSTNode(BSTNode root,int data){
        if (root==null){
            return null;
        }
        if (data>root.data){
            root.rchild=removeBSTNode(root.rchild,data);
        }else if(data<root.data){
            root.lchild=removeBSTNode(root.lchild,data);
        }else {
            if (root.lchild!=null && root.rchild!=null){
                root.data=findMin(root.rchild).data;
                root.rchild=removeBSTNode(root.rchild,root.data);
            }else {
                root=(root.lchild!=null)?root.lchild:root.rchild;
            }
        }
        return root;
    }

    public static void printTree(BSTNode root){
        SequenceQueue<BSTNode> queue=new SequenceQueue<>();
        StringBuilder sb=new StringBuilder();
        BSTNode p=root;
        if (p!=null){
            queue.push(p);
        }
        while (!queue.isEmpty()){
            BSTNode node=queue.pop();
            sb.append(node.data).append(" ");
            if (node.lchild!=null){
                queue.push(node.lchild);
            }
            if(node.rchild!=null){
                queue.push(node.rchild);
            }
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args){
        int[] array={10,18,3,8,12,2,7,3};
        BSTNode root=new BSTNode(array[0]);
        for (int i=1;i<array.length;i++){
            BinarySortTree.insertNode(root,array[i]);
        }
        System.out.print("二叉排序树构造完成：");
        BinarySortTree.printTree(root);
        System.out.print("是否找到节点12：");
        System.out.println(BinarySortTree.searchBSTNode(root,12));
        BinarySortTree.removeBSTNode(root,3);
        System.out.print("删除一个节点后：");
        BinarySortTree.printTree(root);
    }
}
