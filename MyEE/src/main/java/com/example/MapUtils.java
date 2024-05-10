package com.example;

import cn.hutool.core.collection.CollUtil;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import cn.hutool.core.collection.CollectionUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * FileName: MapUtils
 * Author: bai
 * Date:   20242024/4/29下午4:31
 * Description:MapUtils的测试
 * <author> maziyu
 */
public class MapUtils {


    public static <K,V> List<V> getList(Multimap<K, V> multimap, Collection<K> keys) {
        ArrayList<V> objects = new ArrayList<>();
        keys.forEach(key -> {
            Collection<V> list = multimap.get(key);
            if(CollectionUtil.isEmpty(list)){
                return ;
            }
            objects.addAll(list);
        });
        return objects;
    }

    public static void main(String[] args) {
        Multimap<String, String> multimap = ArrayListMultimap.create();
        multimap.put("a", "a1");
        multimap.put("a", "a2");
        multimap.put("b", "b1");
        multimap.put("b", "b2");
        multimap.put("c", "c1");
        multimap.put("c", "c2");
        multimap.put("c", "c3");

        List<String> list = getList(multimap, CollUtil.newArrayList("a", "b", "c"));
        System.out.println(list);
    }
}
