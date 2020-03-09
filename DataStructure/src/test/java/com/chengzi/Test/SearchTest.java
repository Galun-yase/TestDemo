package com.chengzi.Test;

import com.chengzi.Search.Search;

import java.util.Arrays;

public class SearchTest {
    public static void main(String[] args){
        int[] seqList={5, 13, 19, 21, 37, 56, 64, 75, 80, 88, 92};
        System.out.println("顺序查找结果："+Search.SequenceSearch(seqList,88));
        Arrays.sort(seqList);
        System.out.println("二分查找结果："+Search.BinarySearch(seqList,80));

        int[] seqList2 = {22, 12, 13, 8, 9, 20, 33, 42, 44, 38, 24, 48, 60, 58, 74, 57, 86, 53};
        int[] indexTable = {22, 48, 86};
        int[] addressTable = {0, 6, 12};
        System.out.println("分块查找结果："+Search.BlockSearch(indexTable,addressTable,seqList2,48));

    }
}
