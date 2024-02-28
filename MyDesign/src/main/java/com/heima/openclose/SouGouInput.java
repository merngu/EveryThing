package com.heima.openclose;

public class SouGouInput{
    AbstractSkin abstractSkin;

    public AbstractSkin getAbstractSkin() {
        return abstractSkin;
    }

    public void setAbstractSkin(AbstractSkin abstractSkin) {
        this.abstractSkin = abstractSkin;
    }

    /**
     *  用总的去调晓得
     */
    public void display(){
        abstractSkin.display();
    }
}
