package com.example.linked;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * FileName: UserTest
 * Date:   20252025/3/4下午4:56
 * Description:进行测试
 * <author> maziyu
 */
public class UserTest {
    public static void main(String[] args) throws JsonProcessingException {
        User user = new User("John", 30, null);
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        System.out.println(json);
    }
}
