package com.exaple.sixteen_proxy.AbstractFactory;

public interface AbstractFactory {
    //制造发动机
    public Engine createEngine();
    //制造空调
    public Aircondition createAircondition();
}
