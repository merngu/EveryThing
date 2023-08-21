package com.exaple.bigseven;

// 通过构造器进行依赖传递
public class DependencyPass2 {
    public static void main(String[] args) {

        ChangHong2 changHong = new ChangHong2();

        OpenAndClose2 openAndClose2 = new OpenAndClose2(changHong);

        openAndClose2.open();

    }
}


class ChangHong2 implements ITV2{

    public void play() {
        System.out.println("长虹");
    }

}

interface IOpenAndClose2{
    public void open();
}

interface ITV2{
    public void play();
}

class OpenAndClose2 implements IOpenAndClose2{

    public ITV2 tv;

    public OpenAndClose2(ITV2 tv){
        this.tv = tv;
    }

    public void open() {
       this.tv.play();
    }

}


