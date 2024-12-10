package com.example;

/**
 * FileName: Test
 * Author: bai
 * Date:   20242024/5/29下午1:57
 * Description:测试break和continue
 * <author> maziyu
 */
public class TestBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("第"+(i+1)+"次循环：");
            for (int j = 0; j < 5; j++) {
                if (j==3){
//                    break;
                    continue;
                }
                System.out.println("j" + j);
            }
            System.out.println("====test====" );
        }
    }
}
