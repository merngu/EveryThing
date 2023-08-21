package com.exaple.bigseven;


/**
 *  单一职责： 一个类只负责一类职责
 *
 *  在方式1的run方法中，违反了单一职责原则
 *
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("摩托车666");
    }
}

class Vehicle{
    public void run(String vehicle){
        System.out.println( "今天使用" + vehicle );
    }
}
