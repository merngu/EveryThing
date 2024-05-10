package com.example.ex;

/**
 * FileName: ThrowableExample
 * Author: bai
 * Date:   20242024/3/25下午2:44
 * Description:Throwable的案例
 * <author> maziyu
 */
public class ThrowableExample {
    public static void main(String[] args) {
        try {
            int result = ddivide(10,0);
        } catch (ArithmeticException ar){
            System.err.println("An error occured:" + ar.getMessage());
            ar.printStackTrace();
        }
    }

    public static int ddivide(int num1,int num2){
        if (num2 == 0){
            throw new ArithmeticException("Division by zero");
        } else {
         return num1/num2;
        }
    }
}
