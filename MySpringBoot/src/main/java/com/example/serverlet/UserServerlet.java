package com.example.serverlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * FileName: UserServerlet
 * Author: bai
 * Date:   20242024/7/16下午2:02
 * Description:
 * <author> maziyu
 */


@WebServlet(name = "userServerlet",
            urlPatterns = {"/userServlet1","/userServlet2","/userServlet"},
            initParams = {@WebInitParam(name = "encoding", value = "UTF-8")},
            loadOnStartup = 6
)
public class UserServerlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String username = req.getParameter("username");

        if ("admin".equals(username)){
            res.getWriter().write("hello admin");
        } else {
            res.getWriter().write("hello user");
        }

        ServletConfig servletConfig = this.getServletConfig();

        String value = servletConfig.getInitParameter("param1");

        System.out.println("param1" + value);

        Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();

        while (initParameterNames.hasMoreElements()) {
            String paramaterName = initParameterNames.nextElement();
            System.out.println(paramaterName + " : " + servletConfig.getInitParameter(paramaterName));
        }

    }
}
