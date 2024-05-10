package com.example;

/**
 * FileName: Name
 * Author: bai
 * Date:   20242024/3/28下午4:34
 * Description:测试使用
 * <author> maziyu
 */



public class Name {
    String name;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                '}';
    }
}
