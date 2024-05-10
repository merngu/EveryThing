package com.example.leet;

import java.util.Arrays;

/**
 * FileName: TwoSumAdd
 * Author: bai
 * Date:   20242024/3/26下午2:52
 * Description: 我的实现思路是
 * <author> maziyu
 */
public class TwoSumAdd {
    public static void main(String[] args) {
        int[] a = {2,4,3};
        int[] b = {5,6,4};


//        System.out.println(Arrays.toString(need(a,b)));

//        System.out.println(num(a) + num(b));

        int c= num(a) + num(b);

        System.out.println(Arrays.toString(toArr(c)));

    }


    public static int num(int[] arr){
        int num = 0;
        for (int i = arr.length - 1; i >=0 ; i--) {
            int weight = (int) Math.pow(10,i);
            num+=arr[i]*weight;
        }
        return num;
    }


    public static int[] toArr(int num){
        String tonum = String.valueOf(num);
        int len = tonum.length();

        int[] toArr = new int[len];

        for (int i = 0; i < tonum.length(); i++) {
               toArr[i] = Character.getNumericValue(tonum.charAt(i));
        }


        int left = 0;
        int right = toArr.length - 1;
        while (left < right){
           int temp = toArr[left];
            toArr[left] = toArr[right];
            toArr[right] = temp;
           left++;
           right--;
        }


        return toArr;
    }

    public static int[] need (int[] arr,int[]arr1){
        int maxLength = Math.max(arr.length, arr1.length);

        if (arr.length == arr1.length){

            int[] need = new int[maxLength];

            for (int i = 0; i < arr.length; i++) {

              if (arr[i] + arr1[i] > 9) {
                  maxLength++;
              }


              need[arr.length - 1 - i] = arr[i] + arr1[i];

            }
            return need;
        } else if (arr.length > arr1.length) {
            int[] need = new int[maxLength];

            for (int i = 0; i < arr.length; i++) {
                if (arr1.length - 1>i){
                    need[arr.length - 1 - i] = arr[i] + arr1[i];
                } else {
                    need[arr.length - 1 - i] = arr[i];
                }
            }
            return need;
        } else {
            for (int i = 0; i < arr.length - 1; i++) {

                int[] need = new int[maxLength];

                if (arr.length - 1>i){
                    need[arr.length - 1 - i] = arr[i] + arr1[i];
                } else {
                    need[arr.length - i - 1] = arr[i];
                }
            }
        }

        return null;
    }


}
