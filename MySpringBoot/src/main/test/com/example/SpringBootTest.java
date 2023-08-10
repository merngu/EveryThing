package com.example;

import com.example.bean.User;
import com.example.controller.BookController;
import com.example.mapper.UserDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.boot.test.context.SpringBootTest
public class SpringBootTest {
    @Autowired
    private UserDao userDao;


    @Test
    public void test01(){
        List<User> all = userDao.getALL();
        System.out.println(all);
    }
}
