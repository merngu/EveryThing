package com.exaple.fifteen_proxy.staticproxy;


public class TeacherDao implements ITeacherDao{


    public void teach() {
        System.out.println("teacher ..........");
    }

    public void sayHello(String name) {
        System.out.println(name + "你好啊");
    }

}
