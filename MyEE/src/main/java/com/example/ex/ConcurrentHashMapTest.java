package com.example.ex;

import com.example.Name;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * FileName: ConcurrentHashMapTest
 * Author: bai
 * Date:   20242024/3/28下午4:28
 * Description:ConcurrentHashMap的测试类
 * <author> maziyu
 */
public class ConcurrentHashMapTest {
    public static void main(String[] args) {
        Map<Long, Name> WATCHING_APPS = new ConcurrentHashMap<>(0);
        WATCHING_APPS.put(1L,new Name("可以") );
        WATCHING_APPS.put(2L,new Name("可以2"));
        WATCHING_APPS.put(3L,new Name("可以3"));
        WATCHING_APPS.put(4L,new Name("可以4"));
        WATCHING_APPS.put(5L,new Name("可以5"));
        WATCHING_APPS.put(6L,new Name("可以6"));

        Collection<Name> values = WATCHING_APPS.values();


        for (Name name:
             values) {
            System.out.println(name.getName());
        }
    }
}
