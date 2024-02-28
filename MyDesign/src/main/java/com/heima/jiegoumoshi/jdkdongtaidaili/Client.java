package com.heima.jiegoumoshi.jdkdongtaidaili;

import com.heima.jiegoumoshi.jingtaidaili.SellTickets;

public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxyObject = proxyFactory.getProxyObject();

        proxyObject.sell();
    }
}
