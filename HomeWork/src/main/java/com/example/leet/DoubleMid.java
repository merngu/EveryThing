package com.example.leet;

import java.util.Arrays;

/**
 * FileName: DoubleMid
 * Author: bai
 * Date:   20242024/5/16上午9:21
 * Description:求两个数组的中位数
 * <author> maziyu
 */
public class DoubleMid {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        int len = len1 + len2;

        int[] num3 = new int[len];

        System.arraycopy(nums1, 0,num3,0,len1);
        System.arraycopy(nums2, 0,num3,len1,len2);

        Arrays.sort(num3);



        if (len % 2 == 0){
            System.out.println(num3[len/2-1]);
            System.out.println(num3[len/2]);

            return (num3[len/2-1] + num3[len/2]) / 2.0;
        } else {
            return num3[len/2];
        }

    }


    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        DoubleMid doubleMid = new DoubleMid();
        double medianSortedArrays = doubleMid.findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }
}
