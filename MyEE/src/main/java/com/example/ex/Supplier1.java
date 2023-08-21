package com.example.ex;

import java.util.function.Supplier;

public class Supplier1 {
    public static void main(String[] args) {

        Supplier<String> integerSupplier1 = () -> {
          return new String("test1");
        };

        Supplier<String> integerSupplier2 = () -> "test2";

        Supplier<String> integerSupplier3 = String::new;

        System.out.println(integerSupplier3.get());
        System.out.println(integerSupplier1.get());
        System.out.println(integerSupplier2.get());

    }
}
