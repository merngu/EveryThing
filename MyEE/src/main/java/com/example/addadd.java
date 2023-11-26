package com.example;

public class addadd {
    public static void main(String[] args) {
        int n = 0;
        int m = 0;
        for (int i = 0; i < 10; i++) {



            System.out.println("n++: " + n++);
            System.out.println("++m: " + ++m);

        }

        int i = 0;
        int result = ++i; // i 先加 1，然后 result 变成 6


        System.out.println(result);

        int j = 0;

        int resultj = i++;

        System.out.println(resultj);


    }
}
