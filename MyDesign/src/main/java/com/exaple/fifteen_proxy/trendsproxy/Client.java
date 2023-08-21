package com.exaple.fifteen_proxy.trendsproxy;

import com.exaple.fifteen_proxy.staticproxy.ITeacherDao;
import com.exaple.fifteen_proxy.staticproxy.TeacherDao;

public class Client {
    public static void main(String[] args) {

        TeacherDao teacherDao = new TeacherDao();

        // 给目标对象，创建代理对象，可以转换成ITeacherDao
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(teacherDao).getProxyInstance();

        proxyInstance.teach();

        proxyInstance.sayHello("布丁");


    }
}
