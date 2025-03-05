package com.example.linked;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * FileName: User
 * Date:   20252025/3/4下午4:43
 * Description:
 * <author> maziyu
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    private String name;
    private Integer age;
    private String address;

    // 带参数的构造函数
    public User(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // 添加无参构造函数
    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}


