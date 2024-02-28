package com.heima.jiegoumoshi.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {

    private TrainStation target = new TrainStation();

    public TrainStation getProxyObject() {

        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(target.getClass());

        enhancer.setCallback(this);

        TrainStation object = (TrainStation) enhancer.create();

        return object;

    }


    public TrainStation intercept(Object o,Method method,Object[] args,MethodProxy methodProxy) throws Throwable {
        System.out.println("代理点收取一些服务费用(CGLIB动态代理方式)");
        TrainStation trainStation = (TrainStation) methodProxy.invokeSuper(o, args);
        return trainStation;
    }
}
