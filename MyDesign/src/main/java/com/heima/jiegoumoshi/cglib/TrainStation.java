package com.heima.jiegoumoshi.cglib;


import com.heima.jiegoumoshi.jdkdongtaidaili.SellTickets;

public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}


