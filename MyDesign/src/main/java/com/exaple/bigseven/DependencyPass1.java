package com.exaple.bigseven;

public class DependencyPass1 {
    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
        changHong.play();

        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(changHong);
    }
}


interface IOpenAndClose{
    public void open(ITV tv);
}

interface ITV{
    public void play();
}



class ChangHong implements ITV{


    public void play() {
        System.out.println("打开电视");
    }

}

class OpenAndClose implements IOpenAndClose{

    public void open(ITV tv) {
        tv.play();
    }
}


