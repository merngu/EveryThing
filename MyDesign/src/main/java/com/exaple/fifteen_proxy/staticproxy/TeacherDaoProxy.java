package com.exaple.fifteen_proxy.staticproxy;

public class TeacherDaoProxy implements ITeacherDao{

    private ITeacherDao iTeacherDao; // 目标对象，通过接口来聚合

    public TeacherDaoProxy(ITeacherDao iTeacherDao) {
        this.iTeacherDao = iTeacherDao;
    }

    public void teach() {
        System.out.println("开始代理 完成某些操作。。。。。 ");//方法
        iTeacherDao.teach();
        System.out.println("提交。。。。。");//方法
    }

    public void sayHello(String name) {
        iTeacherDao.sayHello("daxaing");
    }
}
