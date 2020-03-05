package com.chengzi.Collection;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class CollectionTest {

    public static void main(String[] args) {

        //数组类型可以存放对象和基本类型且大小固定，集合只能是对象
        List<String> list = new ArrayList<>(Arrays.asList("a", "s", "c", "D"));
        List sub = list.subList(1, 3);


        System.out.println(list);
        System.out.println(sub);
        sub.remove("s");
        System.out.println(list);


    }
}
