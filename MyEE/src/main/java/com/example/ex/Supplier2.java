package com.example.ex;

import java.util.function.Supplier;

public class Supplier2 {
    public static void main(String[] args) {
        Supplier<Student> integerSupplier = () -> {
            return new Student("test");
        };


        Student a = integerSupplier.get();
        Student b = integerSupplier.get();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }

    static class Student{
        private  String name;

        public Student(String name) {
            this.name = name;
        }
    }
}
