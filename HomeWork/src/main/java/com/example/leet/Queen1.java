package com.example.leet;

import java.util.Arrays;

/**
 * FileName: Queen1
 * Author: bai
 * Date:   20242024/3/8下午3:23
 * Description:queen1
 * <author> maziyu
 */
public class Queen1 {

    int max = 2;

    int[]arr = new int[max];

    static int count = 0;

    static int judgeCount = 0;


    public static void main(String[] args) {
        Queen1 queen1 = new Queen1();
        queen1.check(0);
        System.out.printf("一共有%d解法",count);
        System.out.printf("一共判断冲突的次数%d次",judgeCount);
    }

    private void check(int n) {
        if (n == max){
            print();
            return;
        }

        for (int i = 0; i < max; i++) {

            arr[n] = i;

            if (judge(n)){
                check(n+1);
            }
        }

    }

    private boolean judge(int n) {

        judgeCount++;
        System.out.println(judgeCount);
        for (int i = 0; i < n; i++) {
            System.out.println("此时的n为 " + n);
            System.out.println("此时的i为 " + i);
            System.out.println("此时的arr为 " + Arrays.toString(arr));
            System.out.println("此时的arr[i],arr[n]为 " + arr[i] + "----" + arr[n]);
//            System.out.println("Math.abs(n - i)  " + Math.abs(n - i) );
            System.out.println("Math.abs(n - i) == Math.abs(arr[n] - arr[i]))  " + Math.abs(n - i) + "-----" + Math.abs(arr[n] - arr[i]) );


            if (arr[i] == arr[n] || Math.abs(n - i) == Math.abs(arr[n] - arr[i])){
                return false;
            }

        }

        return true;
    }

    private void print(){
        System.out.println("输出皇后摆放的位置输出");
        count++;
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + "");
        }
        System.out.println();
    }
}
