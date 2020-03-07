package com.chengzi.Tree;

import java.util.Arrays;

class HTNode{
    int weight;
    int parent;
    int lchild;
    int rchild;
    public HTNode(){
        this.weight=0;
        this.parent=-1;
        this.lchild=-1;
        this.rchild=-1;
    }
}
public class HuffmanTree {
    /**
     *
     * @param huffmanTree 存放哈夫曼树节点的数组
     * @param weights  叶子节点的权值
     * @param n  叶子节点的个数
     */
    public static void buildHuffmanTree(HTNode[] huffmanTree,int[] weights,int n){
        if (n<=1){
            return;
        }
        //初始化哈夫曼树
        for (int i=0;i<huffmanTree.length;i++){
            HTNode newnode=new HTNode();
            huffmanTree[i]=newnode;
        }
        //读入权值
        for (int i=0;i<n;i++){
            huffmanTree[i].weight=weights[i];
        }
        //构造哈夫曼树
        for (int i=0;i<n-1;i++){
            int m1=Integer.MAX_VALUE;
            int m2=Integer.MAX_VALUE;
            int x1=0,x2=0;
            //找出剩余节点中最小的两个权值
            for (int j=0;j<n+i;j++){
                if (huffmanTree[j].weight<m1&&huffmanTree[j].parent==-1){
                    m2=m1;
                    x2=x1;
                    m1=huffmanTree[j].weight;
                    x1=j;
                }else if (huffmanTree[j].weight<m2 && huffmanTree[j].parent==-1){
                    m2=huffmanTree[j].weight;
                    x2=j;
                }
            }
            huffmanTree[x1].parent=n+i;
            huffmanTree[x2].parent=n+i;
            huffmanTree[n+i].weight=huffmanTree[x1].weight+huffmanTree[x2].weight;
            huffmanTree[n+i].lchild=x1;
            huffmanTree[n+i].rchild=x2;
        }
    }

    //给叶子节点编码
    public static void huffmanCode(HTNode[] huffmanTree,int n){
        for (int i=0;i<n;i++){
            int c=i;
            int p=huffmanTree[c].parent;

            StringBuilder sb=new StringBuilder();
            while (p!=-1){
                if (huffmanTree[p].lchild==c){
                    sb.append("0");
                }else {
                    sb.append("1");
                }
                c=p;
                p=huffmanTree[c].parent;
            }
            System.out.println(sb.reverse());
        }
    }

    public static void main(String[] args){
        int n=5;
        HTNode[] huffmanTree=new HTNode[2*n-1];
        int[] weights={2,4,2,3,3};
        buildHuffmanTree(huffmanTree,weights,n);
        for (int i=0;i<huffmanTree.length;i++){
            System.out.print(huffmanTree[i].weight+" ");
        }
        System.out.println();
        huffmanCode(huffmanTree,n);
    }
}
