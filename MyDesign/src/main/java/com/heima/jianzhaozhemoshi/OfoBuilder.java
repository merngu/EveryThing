package com.heima.jianzhaozhemoshi;

/**
 * @version v1.0
 * @ClassName: OfoBuilder
 * @Description: ofo单车构建者，用来构建ofo单车
 * @Author: 黑马程序员
 */
public class OfoBuilder extends Builder {
    public void buildFrame() {
        mbike.setFrame("铝合金车架");
    }

    public void buildSeat() {
        mbike.setSeat("橡胶车座");
    }

    public Bike createBike() {
        return mbike;
    }
}
