package com.chengzi.Search;

public class Search {
    //顺序查找   ASL=n/2
    public static int SequenceSearch(int[] seqList,int key){
        for (int i=0;i<seqList.length;i++){
            if (key==seqList[i]){
                return i;
            }else {
                continue;
            }
        }
        return -1;
    }

    //折半查找   ASL=logn
    public static int BinarySearch(int[] seqList,int key){
        int begin=0;
        int end=seqList.length;
        int mid;
        while (begin<=end){
            mid=(begin+end)/2;
            if (seqList[mid]==key){
                return mid;
            }else if (key<seqList[mid]){
                end=mid-1;
            }else {
                begin=mid+1;
            }
        }
        return -1;
    }

    /**
     *
     * @param indexTable    索引表
     * @param addressTable  块的地址表
     * @param seqList       待查找的顺序表
     * @param key           待查找的字段
     * @return              查到返回位置，未查到返回-1
     */
    //分块查找（先折半再顺序）
    public static int BlockSearch(int[] indexTable,int[] addressTable,int[] seqList,int key){
        int begin=0;
        int end=indexTable.length-1;
        int mid;
        while (begin<=end){
            mid=(begin+end)/2;
            if (key<=indexTable[mid]){
                end=mid-1;
            }else {
                begin=mid+1;
            }
        }
        int searchEnd;
        if (begin==indexTable.length-1){
            searchEnd=seqList.length;
        }else {
            searchEnd=addressTable[begin+1];
        }
        for (int i=addressTable[begin];i<searchEnd;i++){
            if (key==seqList[i]){
                return i;
            }
        }
        return -1;
    }
}
