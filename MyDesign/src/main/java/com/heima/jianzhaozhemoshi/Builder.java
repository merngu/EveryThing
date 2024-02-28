package com.heima.jianzhaozhemoshi;

public abstract class Builder {
    protected Bike mbike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();
}
