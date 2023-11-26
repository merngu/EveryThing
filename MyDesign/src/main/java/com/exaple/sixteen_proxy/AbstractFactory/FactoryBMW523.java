package com.exaple.sixteen_proxy.AbstractFactory;

public class FactoryBMW523 implements AbstractFactory{


    public Engine createEngine() {
        return new EngineB();
    }

    public Aircondition createAircondition() {
        return new AirconditionB();
    }

}
