package com.example.stack;

/**
 * FileName: ArrayStackDemo
 * Date:   20242024/8/19下午5:22
 * Description:栈测试
 * <author> maziyu
 */
public class ArrayStackDemo {
    public static void main(String[] args)
    {
        ArrayStack01 stack = new ArrayStack01(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.list();
        stack.pop();
        stack.list();
    }
}
