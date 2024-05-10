package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * FileName: StreamTest
 * Author: bai
 * Date:   20242024/4/29下午6:03
 * Description:Stream的学习
 * <author> maziyu
 */
public class StreamTest {

    // 写一个算法



    // 1.Stream的创建
    public static void main(String[] args)
    {
        // 1.1 集合创建Stream
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();
        Stream<String> parallelStream = list.parallelStream();

        // 1.2 数组创建Stream
        int[] arr = {1,2,3,4,5};
        IntStream stream1 = Arrays.stream(arr);

        // 1.3 Stream的构造
        Stream<Integer> stream2 = Stream.of(1,2,3,4,5);
    }
}
