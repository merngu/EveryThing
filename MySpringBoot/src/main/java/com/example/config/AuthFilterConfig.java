package com.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthFilterConfig implements Filter {


    private String apiContext = "api";

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("认证过滤器触发成功");

        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse)servletResponse;

        String requestURI = httpServletRequest.getRequestURI();
        System.out.println("URI是:" + requestURI);



        String servletPath = requestURI.substring(apiContext.length() + 2);

        System.out.println("servletPath 是" + servletPath);

        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }

}
