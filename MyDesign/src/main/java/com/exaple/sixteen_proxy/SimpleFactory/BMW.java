package com.exaple.sixteen_proxy.SimpleFactory;

abstract class BMW {
    public BMW(){

    }

    public static interface FactoryBMW {
        BMW createBMW();
    }
}
