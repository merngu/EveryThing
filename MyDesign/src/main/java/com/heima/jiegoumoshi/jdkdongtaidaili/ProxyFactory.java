package com.heima.jiegoumoshi.jdkdongtaidaili;

import com.heima.jiegoumoshi.jingtaidaili.SellTickets;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private TrainStation station = new TrainStation();

    public SellTickets getProxyObject(){
        SellTickets sellTickets = (SellTickets) Proxy.newProxyInstance(station.getClass().getClassLoader(), station.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return null;
            }
        });

        return sellTickets;
    }


}
