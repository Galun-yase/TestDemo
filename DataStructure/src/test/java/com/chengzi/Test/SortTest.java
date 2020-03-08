package com.chengzi.Test;

import com.chengzi.Sort.ExchangeSort;
import com.chengzi.Sort.InsertSort;
import com.chengzi.Sort.MergeSort;
import com.chengzi.Sort.SelectSort;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args){
        int[] seqList={7,3,8,2,5,10};
        InsertSort.starightInsertSort(seqList);
        System.out.println("直接插入排序："+ Arrays.toString(seqList));
        InsertSort.shellSort(seqList);
        System.out.println("希 尔 排 序："+ Arrays.toString(seqList));

        ExchangeSort.bubbleSort(seqList);
        System.out.println("冒 泡 排 序："+ Arrays.toString(seqList));
        ExchangeSort.quickSort(seqList,0,seqList.length-1);
        System.out.println("快 速 排 序："+ Arrays.toString(seqList));

        SelectSort.starightSelectSort(seqList);
        System.out.println("直接选择排序："+ Arrays.toString(seqList));
        SelectSort.heapSort(seqList);
        System.out.println("堆   排   序："+ Arrays.toString(seqList));

        MergeSort.mergeSort(seqList,0,5);
        System.out.println("归 并 排  序："+ Arrays.toString(seqList));
    }
}
