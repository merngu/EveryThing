package com.example;

import com.google.common.collect.ArrayListMultimap;

/**
 * FileName: MultimapExample
 * Author: bai
 * Date:   20242024/4/30下午4:44
 * Description:使用案例
 * <author> maziyu
 */
public class MultimapExample {
    public static void main(String[] args) {
        ArrayListMultimap<String, String> multimap = ArrayListMultimap.create();
        multimap.put("a","aaa");
        multimap.put("a","aaaa");


        System.out.println(multimap.get("a"));
    }
}
