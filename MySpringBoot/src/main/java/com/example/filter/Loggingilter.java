package com.example.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * FileName: Loggingilter
 * Author: bai
 * Date:   20242024/7/17下午3:53
 * Description:
 * <author> maziyu
 */
public class Loggingilter implements Filter {

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;


        String requestURI = request.getRequestURI();
        String time = sdf.format(new Date());
        String beforeLogging = requestURI + "在" + time + "访问";

        System.out.println(beforeLogging);

        long t1 = System.currentTimeMillis();
        filterChain.doFilter(request, response);
        long t2 = System.currentTimeMillis();
        // 拼接日志文本
        String afterLogging =requestURI+"在"+time+"的请求耗时:"+(t2-t1)+"毫秒";
        // 打印日志
        System.out.println(afterLogging);
    }
}
