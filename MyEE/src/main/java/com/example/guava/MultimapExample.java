package com.example.guava;

import com.google.common.collect.ArrayListMultimap;
import org.checkerframework.checker.nullness.qual.Nullable;

/**
 * FileName: MultimapExample
 * Date:   20242024/12/2下午3:13
 * Description:学习Multimap
 * <author> maziyu
 */
public class MultimapExample {
    public static void main(String[] args) {
        ArrayListMultimap<String, String> objectObjectArrayListMultimap = ArrayListMultimap.create();

        objectObjectArrayListMultimap.put("a", "aaa");
        objectObjectArrayListMultimap.put("a", "bbb");
        objectObjectArrayListMultimap.put("c", "ccc");


        // 获取与特定键关联的所有值
        System.out.println(objectObjectArrayListMultimap.get("a")); // 输出：[value1, value2]

        // 获取所有键
        System.out.println(objectObjectArrayListMultimap.keys()); // 输出：[key1, key2]

        // 移除一个键值对
        objectObjectArrayListMultimap.remove("a", "aaa");

        // 清空所有键值对
        objectObjectArrayListMultimap.clear();
    }
}
