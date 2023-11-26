package com.example.linked;

// 注意:使用二分查找法的前提是数组是有序的
public class binarysearchnorecursion {
    public static void main(String[] args) {
        int[] arr = {1,8,10,89,1000,1000,1234};
        binarySearch(arr, 0, arr.length - 1, 1000);
        System.out.println();
    }
    public static int binarySearch(int[] arr,int left,int right,int findVal){
        // 当left > right时,说明递归整个数组,但是没有找到
        if(left > right){
            return -1;
        }

        int mid = (left + right)/2;
        int midVal = arr[mid];

        if(findVal > midVal){
            return binarySearch(arr,mid + 1,right,findVal);
        } else if (findVal < midVal){
            return binarySearch(arr,left,mid - 1,findVal);
        } else {
            return mid;
        }
    }



}
