package com.example.ex;

import java.lang.annotation.Annotation;
@MyAnnotation
public class MyAnnotationTest {
    public static void main(String[] args) {
        Class myAnnotationTestClass = MyAnnotationTest.class;

        Annotation annotations = myAnnotationTestClass.getAnnotation(MyAnnotation.class);
        MyAnnotation annotations1 = (MyAnnotation)annotations;
        String info = annotations1.value();
        System.out.println(info);

    }
}
