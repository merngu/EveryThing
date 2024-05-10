package com.example.leet;


import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * FileName: Queen8
 * Author: bai
 * Date:   20242024/3/1下午4:48
 * Description:8皇后问题,学习回溯算法
 * <author> maziyu
 */
public class Queen8 {
    /**
     * 整体思路: 创建一个数组,默认每行是下标,存储的值是每列的值
     */



    // 定义一个max表示有多少个皇后
    int max = 8;

    // 定义数组arr,保存皇后放置位置的结果,比如arr = {0,4,7,5,2,6,1,3}
    // 存储的位置 是 0,0 1,4 2,7 3,5 4,2 5,6 6,1 7,3
    // 按照每行进行存放
    int[] arr = new int[max];

    static int count = 0 ;

    static int judgeCount = 0;

    public static void main(String[] args) {
        Queen8 queen8 = new Queen8();
        // 从第一行开始
        queen8.check(0);
        System.out.printf("一共有%d解法",count);
        System.out.printf("一共判断冲突的次数%d次",judgeCount);
    }

    // 编写一个方法,放置第n个皇后,n代表行
    private void check(int n){

        //防止代码死循环
        if(n == max){
            print();
            return;
        }

        // 依次放入皇后,并判断是否冲突
        // i 表示 列
        for (int i = 0; i < max; i++) {

            // 先把当前这个皇后n,放到该行的第一列
            // n代表的是行 i是列
            arr[n] = i;
            // 判断当放置第n个皇后到i列时,是否冲突
//            System.out.println(judge(n));
            if(judge(n)){ // 不冲突
                // 接着放n+1个皇后,即开始递归
                check(n+1);
            }

            // 如果冲突,就继续执行array[n] = i;即将第n个皇后,放置在本行的后移的一个位
        }
    }

    // 查看当我们放置第n个皇后,就去监测该皇后是否与前面已经摆放的皇后冲突
    private boolean judge(int n) {
        // judgeCount 判断结果
        judgeCount++;
        System.out.println(Arrays.toString(arr));
        // 说明 n 代表行,i代表列
        // 1.array[i] == array[n] 表示判断 第n个皇后是否和前面的n-1个皇后在同一列
        // 2. Math.abs(n-i) == Math.abs(array[n] - array[i]) 表示判断第 n 个皇后是否和第 i 皇后是否在同一斜线
        // 0,0 1,4 2,7 3,5 4,2 5,6 6,1 7,3
        for (int i = 0; i < n; i++) {
            if(arr[i] == arr[n] || Math.abs(n-i) == Math.abs(arr[n] - arr[i])){
                System.out.println("i" + " == " + i);
                System.out.println("n" + " == " + n);
                System.out.println("arr[i]的值" + " == " +arr[i]);
                System.out.println("arr[n]的值" + " == " +arr[n]);
                System.out.println("Math.abs(n-i)" + " == " + Math.abs(n-i));
                System.out.println("Math.abs(arr[n] - arr[i])" + " == " + Math.abs(arr[n] - arr[i]));
                System.out.println("不行");
                return false; // 冲突
            }
        }
        return true; // 不冲突
    }



    // 输出皇后摆放的位置输出
    private void print(){
        System.out.println("输出皇后摆放的位置输出");
        count++;
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + "");
        }
        System.out.println();
    }
}
