package com.heima.hengyuanmoshi;

public abstract class AbstractBox {
    public abstract String getShape();

    public void display(String color){
        System.out.println("方形模块" + this.getShape() + "颜色" + color);
    }
}
