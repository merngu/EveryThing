package com.example.ex;

public class DataArray {
    public static void main(String[] args) {
        /*创建一个长度为6的int型数组，要求数组元素的值都在1-30之间，且是随机赋值。同时，要求
元素的值各不相同。*/
        int[] arr = new int[5];
        int min = 1;
        int max = 30;

        int randomNumber1 = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println(randomNumber1);

        for (int i = 0; i < args.length; i++) {
            int randomNumber = (int) (Math.random() * (max - min + 1)) + min;
            System.out.println(randomNumber);
            arr[i] = randomNumber;
        }

//        System.out.println(arr);

        for (int i = 0; i < args.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
