package com.heima.jianzhaozhemoshi;

public class MobikeBuilder extends Builder{
    @Override   
    public void buildFrame() {
        mbike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        mbike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return mbike;
    }
}
