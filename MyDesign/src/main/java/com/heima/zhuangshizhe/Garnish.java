package com.heima.zhuangshizhe;

public abstract class Garnish  extends FastFood{

    private FastFood fastFood;

    public FastFood getFastFood(){
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
