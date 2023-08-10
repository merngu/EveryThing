package com.example.mapper;


import com.example.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {
    @Select("select id from user")
    public List<User> getALL();
}
