package com.rock.bean;

/**
 * FileName: Employee
 * Author: bai
 * Date:   20242024/3/27下午5:43
 * Description:员工实体类
 * <author> maziyu
 */
public class Employee {
    private Integer id ;
    private String lastName;
    private String email ;
    private Integer gender ;
    private Integer age ;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getGender() {
        return gender;
    }
    public void setGender(Integer gender) {
        this.gender = gender;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", lastName=" + lastName + ", email=" + email
                + ", gender=" + gender + ", age="
                + age + "]";
    }
}
