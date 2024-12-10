package com.example.dongtaiguihua14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * FileName: climbing_stairs_backtrack
 * Author: bai
 * Date:   20242024/5/29上午9:51
 * Description:爬n阶楼梯
 * <author> maziyu
 */
public class climbing_stairs_backtrack {
    public static void main(String[] args) {
        System.out.println(climbingStairsBacktrack(3));
    }

    /**
     * @param choices 每次 走的步数
     * @param state 所在的阶数
     * @param n 台阶数
     * @param res 结果数
     */

    public static void back(List<Integer> choices,int state,int n,List<Integer> res){

//        System.out.println("== start ==");
        // 每当 完成记录一种 一种方案
        if (state == n){
            res.set(0, res.get(0) + 1);
        }

        for (Integer choice: choices) {
            // 当前所在的台阶 + 所要走的台阶 > n 时,直接跳出
            if (state + choice > n){
                continue;
            }
            back(choices,state + choice,n,res);

        }
    }


    static int climbingStairsBacktrack(int n){
        List<Integer> choices = Arrays.asList(1,2); // 上台阶选择的1或2
        int state = 0; // 从 0 阶开始
        ArrayList<Integer> res = new ArrayList<>(); // 结果
        res.add(0);
        back(choices,state,n,res);
        return res.get(0);
    }
}
