package com.example.Service;


import com.example.bean.Book;
import com.baomidou.mybatisplus.core.metadata.IPage;
import java.util.List;

public interface BookService {
    boolean save(Book book);
    boolean delete(Integer id);
    boolean update(Book book);
    Book getById(Integer id);
    List<Book> getAll();
    IPage<Book> getByPage(int currentPage,int pageSize);
}
