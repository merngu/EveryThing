package com.heima.zhuangshizhe;

public class Egg extends Garnish{
    public Egg( FastFood fastFood) {
        super(1, "鸡蛋", fastFood);
    }

    public float cost(){
        return getPrice() + getFastFood().getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
