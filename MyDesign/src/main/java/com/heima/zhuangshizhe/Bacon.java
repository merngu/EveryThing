package com.heima.zhuangshizhe;

import com.sun.org.apache.xpath.internal.operations.String;

public class Bacon extends Garnish{
    public Bacon(float price, String desc, FastFood fastFood) {
        super(2, "培根", fastFood);
    }

    @Override
    public float getPrice() {
        return getPrice() + getFastFood().getPrice();
    }

    @Override
    public java.lang.String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
