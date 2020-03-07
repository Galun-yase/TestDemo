package com.chengzi.Test;

import com.chengzi.Tree.SequenceTree;

public class SequenceTreeTest {

    public static void main(String[] args){
        SequenceTree<String> stree=new SequenceTree<>("A");
        stree.add(1,"B",true);
        stree.add(1,"B",false);
        stree.add(2,"D",true);
        stree.add(2,"E",false);
        stree.add(3,"F",false);
        stree.add(5,"G",true);
        System.out.println(stree);

    }
}
