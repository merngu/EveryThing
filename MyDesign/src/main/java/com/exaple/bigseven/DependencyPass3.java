package com.exaple.bigseven;

public class DependencyPass3 {
    public static void main(String[] args) {
        ChangHong3 changHong3 = new ChangHong3();


        OpenClose3 openClose3 = new OpenClose3();
        openClose3.setTv(changHong3);
        openClose3.open();
    }
}


interface IOpenAndClose3{
    public void open();

    public void setTv(ITV3 tv);
}


interface ITV3{
    public void play();
}




class  OpenClose3 implements IOpenAndClose3{

    private ITV3 tv;





    public void open() {
       this.tv.play();
    }

    public void setTv(ITV3 tv) {
        this.tv = tv;
    }
}


class ChangHong3 implements ITV3{

    public void play() {
        System.out.println("长虹电视机，打开");
    }
}
