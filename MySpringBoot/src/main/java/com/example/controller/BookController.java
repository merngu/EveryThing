package com.example.controller;

import com.example.bean.Enterprise;
import com.example.bean.User;
import com.example.mapper.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private UserDao userDao;

    @Value("${lesson}")
    private String lessonName;

    @Value("${server.port}")
    private int port;

    @Value("${enterprise.subject[1]}")
     private String[] subject_01;


    @Autowired
    private Environment environment;


    @Autowired
    private Enterprise enterprise;

    /**
     * @PathVariable 映射 URL 绑定的占位符
     * 通过 @PathVariable 可以将 URL 中占位符参数绑定到控制器处理方法的入参中:URL 中的 {xxx} 占位符可以通过
     * */

    @GetMapping("/{word}")
    public String getById(@PathVariable("name") String word){
        System.out.println("SpringBoot Learn");
        System.out.println(environment.getProperty("lesson"));
        return "SpringBoot Learn";
    }
    @GetMapping("/{id}")
    public String getById2(@PathVariable("id") String name){
        System.out.println(environment.getProperty("enterprise.subject[1]"));
        System.out.println(enterprise.getName());
        List<User> all = userDao.getALL();
        System.out.println(all);
        return "SpringName";
    }
}
