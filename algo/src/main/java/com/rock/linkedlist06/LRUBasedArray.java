package com.rock.linkedlist06;

import java.util.HashMap;
import java.util.Map;


public class LRUBasedArray<T> {
    private static final int DEFAULT_CAPACITY = (1 << 3);

    private int capacity;

    private int count;

    private T[] value;

    private Map<T,Integer> holder;

    public LRUBasedArray() {
        this(DEFAULT_CAPACITY);
    }

    public LRUBasedArray(int capacity) {
        this.capacity = capacity;
        value = (T[]) new Object[capacity];
        count = 0;
        holder = new HashMap<T, Integer>(capacity);
    }

    /**
     * 模拟访问某个值
     */

    public void offer(T object) throws IllegalAccessException {
        if (object == null){
            throw new IllegalAccessException("该缓存容器不支持null!");
        }

        Integer index = holder.get(object);

        if (index == null){
            if (isFull()){
                removeAndCache(object);
            } else {
                cache(object,count);
            }
        } else {
            update(index);
        }
    }

    /**
     * 若缓存中有指定的值，则更新位置
     * @param end
     */

    public void update(int end){
        T target = value[end];
        rightShift(end);
        value[0] = target;
        holder.put(target,0);
    }

    private void rightShift(int end) {
    }

    /**
     * 缓存满的情况,踢出后,再缓存到数据组头部
     */

    private void removeAndCache(T object) {
        T key = value[--count];
        holder.remove(key);
        cache(object,count);
    }

    /*
    * 缓存数据到头部,但要先右移
    * */
    private void cache(T object, int end) {
    }

    private boolean isFull() {
        return count == capacity;
    }


}



 class Test{
    public static void main(String[] args) throws IllegalAccessException {
        testDefaultConstructor();
        testSpecifiedConstructor(4);
//            testWithException();
    }

    private static void testWithException() throws IllegalAccessException {
        LRUBasedArray<Integer> lru = new LRUBasedArray<Integer>();
        lru.offer(null);
    }

    public static void testDefaultConstructor() throws IllegalAccessException {
        System.out.println("======无参测试========");
        LRUBasedArray<Integer> lru = new LRUBasedArray<Integer>();
        lru.offer(1);
        lru.offer(2);
        lru.offer(3);
        lru.offer(4);
        lru.offer(5);
        System.out.println(lru);
        lru.offer(6);
        lru.offer(7);
        lru.offer(8);
        lru.offer(9);
        System.out.println(lru);
    }

    public static void testSpecifiedConstructor(int capacity) throws IllegalAccessException {
        System.out.println("======有参测试========");
        LRUBasedArray<Integer> lru = new LRUBasedArray<Integer>(capacity);
        lru.offer(1);
        System.out.println(lru);
        lru.offer(2);
        System.out.println(lru);
        lru.offer(3);
        System.out.println(lru);
        lru.offer(4);
        System.out.println(lru);
        lru.offer(2);
        System.out.println(lru);
        lru.offer(4);
        System.out.println(lru);
        lru.offer(7);
        System.out.println(lru);
        lru.offer(1);
        System.out.println(lru);
        lru.offer(2);
        System.out.println(lru);
    }
}