package com.rock.use;

/**
 * FileName: BinarySearchNoRecur
 * Author: bai
 * Date:   20242024/5/14下午3:10
 * Description:二分查找法,非递归
 * <author> maziyu
 */
public class BinarySearchNoRecur {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int index = binarySearch(arr, 11);
        System.out.println(index);
    }


    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        System.out.println(left + ":::" + right);
        while(left <= right){
            int mid = (left + right) / 2;
            System.out.println(mid);
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
}
