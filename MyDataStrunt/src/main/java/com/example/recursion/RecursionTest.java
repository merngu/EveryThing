package com.example.recursion;

public class RecursionTest {
    public static void main(String[] args) {
        test(4);
        test2(4);
    }

    private static void test(int i) {
        System.out.println(i);
        i = i - 1;
        if (i<1){
            return;
        }else {
            test(i);
        }
    }


    static void test2(int n) {
        if (n>2){
            test2(n-1);
        }else{
            System.out.println("n=" + n);
        }

    }




}
