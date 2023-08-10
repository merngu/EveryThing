package com.example.controller;

import com.example.bean.Book;
import com.example.bean.Enterprise;
import com.example.bean.User;

import com.example.mapper.UserDao;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class BookController {

//    @Autowired
//    private BookDao bookDao;

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

    @GetMapping("/{word}/{id}")
    public String getById(@PathVariable("name") String word,String id){
        log.info("SpringBoot Learn");
        log.info(environment.getProperty("lesson"));
        return "SpringBoot Learn";
    }
    @GetMapping("/{id}")
    public List<User> getById2(@PathVariable("id") String name){
        log.info(environment.getProperty("enterprise.subject[1]"));
        log.info(enterprise.getName());
        List<User> all = userDao.getALL();
        return all;
    }



}
