package com.chengzi.Sort;

public class ExchangeSort {

    //冒泡排序 时间复杂度O(n2) 空间复杂度O(1)
    public static void bubbleSort(int[] seqList){
        for (int i=0;i<seqList.length;i++){
            boolean flag=true;
            for (int j=0;j<seqList.length-1-i;j++){
                if (seqList[j]>seqList[j+1]){
                    swap(seqList,j,j+1);
                    flag=false;
                }
            }
            if (flag){break;}
        }
    }

    //快速排序 时间复杂度O(nlog2n)-O(n2) 空间复杂度O(log2n)-O(n)
    public static void quickSort(int[] seqList,int left,int right){
        if (left<right){
            int middle_index=partition(seqList,left,right);
            quickSort(seqList,left,middle_index-1);
            quickSort(seqList,middle_index+1,right);
        }

    }

    //快排中用于基准数的位置
    private static int partition(int[] seqList,int first,int last){
        int pivotkey=seqList[first];
        while (first<last){
            while (first<last && seqList[last]>=pivotkey){
                last-=1;
            }
            seqList[first]=seqList[last];
            while (first<last && seqList[first]<=pivotkey){
                first++;
            }
            seqList[last]=seqList[first];

        }
        seqList[first]=pivotkey;
        return first;
    }

    //交换元素位置
    private static void swap(int[] seqList,int index1,int index2){
        int temp=seqList[index1];
        seqList[index1]=seqList[index2];
        seqList[index2]=temp;
    }
}
