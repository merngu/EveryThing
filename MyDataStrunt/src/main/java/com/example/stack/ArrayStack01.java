package com.example.stack;

/**
 * FileName: ArrayStack01
 * Date:   20242024/8/20上午10:12
 * Description:栈练习2
 * <author> maziyu
 */
public class ArrayStack01 {
    private int maxSize;
    private int[] array;
    private int top = -1;


    public ArrayStack01(int maxSize) {
        this.maxSize = maxSize;
        array = new int[this.maxSize];
    }


    public boolean isFull(){
       return top == maxSize - 1;
    }

    public boolean isEmpty() {
       return top == -1;
    }

    public void push(int value){
        if(isFull()){
            System.out.println("栈已满,不需要添加");
            return;
        } else {
         top++;
         array[top]=value;
        }
    }

    public int pop() {
        if(isEmpty()){
            throw new RuntimeException("栈空");
        } else {
            int value = array[top];
            top--;
            return value;
        }
    }


    public void list() {

        for (int i = top; i > -1; i--) {
            System.out.println(array[i]);
        }
    }

}
