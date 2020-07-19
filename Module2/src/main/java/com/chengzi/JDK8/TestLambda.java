package com.chengzi.JDK8;

import org.junit.Test;

import java.awt.*;
import java.util.*;
import java.util.stream.Stream;

public class TestLambda {

    @Test
    public void test1(){
        TreeSet<Integer> ts = new TreeSet<Integer>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if (o1<o2){
                    return 1;
                }else if (o1==o2){
                    return 0;
                }else{
                    return -1;
                }
            }
        });
        ts.addAll(Arrays.asList(2,1,3));
        System.out.println(ts);
    }

    @Test
    public void test2(){
        TreeSet<Integer> ts = new TreeSet<>((x, y) -> Integer.compare(x, y));
        ts.addAll(Arrays.asList(1,5,3));
        System.out.println(ts);
    }

    @Test
    public void test3(){
        Runnable r1 = () -> System.out.println("ss");
        r1.run();

        Integer[] a = {1,2};
        Stream.of(1,23,4);
    }

}
