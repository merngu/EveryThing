package com.example;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.bean.Book;
import com.example.bean.User;
import com.example.mapper.BookDao;
import com.example.mapper.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 *  使用的时候报空指针异常，是因为导入包和起名字和依赖类一样报的错
 */

@SpringBootTest
public class MyTest {
    @Autowired
    private UserDao userDao;

    @Autowired
    private BookDao bookDao;


    @Test
    public void test01(){
        List<User> all = userDao.getALL();
        System.out.println(all);
    }

    @Test
    public void book(){
        Book book = new Book();
        book.setName("A");
        book.setType("A");
        book.setDescription("A");
        bookDao.insert(book);
    }
    @Test
    public void testGetPage(){
        IPage page = new Page(1, 5);
        LambdaQueryWrapper<Book> bookLambdaQueryWrapper = new LambdaQueryWrapper<>();
        bookLambdaQueryWrapper.like(Book::getName, "A");
        bookDao.selectPage(page,bookLambdaQueryWrapper);
    }
}
