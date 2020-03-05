package com.chengzi.Test;

import com.chengzi.LinearList.SequenceList;

public class LinearListTest {
    public static void main(String[] args){
        SequenceList<String> seqlist=new SequenceList();
        seqlist.add("a");
        seqlist.add("b");
        seqlist.add("c");
        seqlist.add("d");
        seqlist.add("e");
        System.out.println(seqlist);
        seqlist.add(1,"ff");
        System.out.println(seqlist);
        seqlist.remove(2);
        System.out.println(seqlist);

    }
}
