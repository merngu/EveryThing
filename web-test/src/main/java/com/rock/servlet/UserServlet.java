package com.rock.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * FileName: UserServlet
 * Author: bai
 * Date:   20242024/7/16上午10:41
 * Description:
 * <author> maziyu
 */
public class UserServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String username = req.getParameter("username");

        if (username.equals("admin")){
            res.getWriter().write("admin");
        } else {
            res.getWriter().write("user");
        }
    }


}
