package com.exaple.sixteen_proxy.FactoryMethod;

public class FactoryBMW320 implements FactoryBMW{
    public BMW createBMW() {
        return new BMW320();
    }
}
