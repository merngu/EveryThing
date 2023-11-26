package com.rock._array;

public class Array {

    //
    public int [] data;

    // 定义数据的长度
    private int n;

    // 实际个数
    private int count;


    public Array(int capacity){
        this.data = new int[capacity];

        this.n = capacity;

        this.count = 0;
    }

    //根据索引，找到数据中的元素并返回
    public int find(int index){
        if (index<0 || index>=count) return -1;
        return data[index];
    }

    //插入元素:头部插入，尾部插入
    public boolean insert(int index,int value){
        // 第一步:先判断数据是受已经满了
        if(n == count){
            System.out.println("空间已满");
            return false;
        }

        // 第二步: 判断位置是否合法
        if(index<0 || index > count){
            return false;
        }


        //  count 实际的个数,index插入的位置
        for (int i = count; i > index ; --i) {
            data[i] = data[i - 1];
        }

        data[index] = value;
        count++;
        return true;
    }

    public boolean delete(int index){
        for (int i = index + 1; i < count; i++) {
            data[i - 1] = data[i];
        }
        count--;
        return true;
    }

    public void printAll(){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Array array = new Array(5);
        array.printAll();
//        array.insert(0, 3);
//        array.insert(0, 4);
//        array.insert(1, 5);
//        array.insert(3, 9);
//        array.insert(3, 10);
        array.insert(4, 11);
        array.printAll();

    }

}
