package com.example.leet;

import java.util.Arrays;
import java.util.HashMap;

/**
 * FileName: TwoNumsTarget
 * Author: bai
 * Date:   20242024/3/26下午2:07
 * Description:两数之和
 * <author> maziyu
 */
public class TwoNumsTarget {


    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int target = 9;

        int[] arr = {2,7,11,15};




        System.out.println(Arrays.toString(aaa(arr,target)));

    }


    // 写成方法
    public static int[] aaa(int[] get,int target){

        for (int i = 0; i < get.length; i++) {
            for (int j = i+1; j < get.length; j++) {
                if (target == get[i] + get[j]){
                    return new int[]{i,j};
                }
            }
        }

        return new int[0];
    }
}
