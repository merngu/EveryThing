package com.example.serverlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * FileName: ServletA
 * Author: bai
 * Date:   20242024/7/17下午4:20
 * Description:
 * <author> maziyu
 */
public class ServletB extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // 处理器请求
        System.out.println("SB");

        try {
            Thread.sleep(15);
        }catch(Exception e){
            throw new RuntimeException(e);
        };
    }
}
