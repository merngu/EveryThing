package com.example.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * FileName: LoginFilter
 * Author: bai
 * Date:   20242024/7/17下午4:56
 * Description:
 * <author> maziyu
 */
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        if (request.getSession().getAttribute("name") != null){
            response.sendRedirect("/hello?name=admin");

        }else {
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }
}
