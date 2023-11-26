package com.exaple.sixteen_proxy.AbstractFactory;

public class FactoryBMW320 implements AbstractFactory{
    public Engine createEngine() {
        return new EngineA();
    }

    public Aircondition createAircondition() {
        return new AirconditionA();
    }
}
