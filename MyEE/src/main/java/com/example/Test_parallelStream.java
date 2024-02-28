package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName: Test_parallelStream
 * Date:   20242024/2/23下午2:20
 * Description:测试parallelStream的demo
 * <author> maziyu
 */
public class Test_parallelStream {
    public static void main(String[] args) {

        List<Long> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add((long) i);
        }
        System.out.println("a:"+list.size());

        List<Long> streamList = new ArrayList<>();
        list.parallelStream().forEach(streamList::add);
        System.out.println("b:"+streamList.size());
    }
}
