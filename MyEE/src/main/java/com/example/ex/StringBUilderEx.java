package com.example.ex;

/**
 * FileName: StringBUilderEx
 * Author: bai
 * Date:   20242024/3/20上午11:15
 * Description:StringBuilder的使用案例
 * <author> maziyu
 */
public class StringBUilderEx {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("11111");
        stringBuilder.append("22222");


        stringBuilder.insert(1,'3');

        System.out.println(stringBuilder);


        String a = "123456";

        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
        }
    }
}
