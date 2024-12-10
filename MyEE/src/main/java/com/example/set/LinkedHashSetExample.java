package com.example.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * FileName: LinkedHashSetExample
 * Date:   20242024/8/29下午1:34
 * Description:
 * <author> maziyu
 */
public class LinkedHashSetExample {
    public static void main(String[] args)
    {
        LinkedHashSet<Test> linkHashSet = new LinkedHashSet();
        linkHashSet.add(new Test("A", 1));
        linkHashSet.add(new Test("A", 1));
        linkHashSet.add(new Test("A", 1));
        linkHashSet.add(new Test("A", 1));
        linkHashSet.add(new Test("A", 1));
        linkHashSet.add(new Test("A", 1));


        System.out.println(linkHashSet);

        Iterator iterator = linkHashSet.iterator();

        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
