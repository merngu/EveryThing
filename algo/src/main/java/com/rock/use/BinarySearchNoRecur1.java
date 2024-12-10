package com.rock.use;

/**
 * FileName: BinarySearchNoRecur1
 * Author: bai
 * Date:   20242024/5/14下午3:19
 * Description:二分查找法第一遍,非递归的算法
 * <author> maziyu
 */
public class BinarySearchNoRecur1 {
    public static int index(int[] arr,int target){
        int left = 0;
        int right = arr.length - 1;

        int middle = (left + right) / 2;

        if (arr[middle] == target){
            return middle;
        } else if (arr[middle] > target){
            middle = middle - 1;
        } else {
            middle = middle + 1;
        }
        return -1;
    }
}
