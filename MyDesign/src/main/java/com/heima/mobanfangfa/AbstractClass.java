package com.heima.mobanfangfa;

public abstract class AbstractClass {
    public final void cookProcess(){
        this.pourOil();
        this.heatOil();
        this.pourVegetable();
        this.pourSauce();
        this.fry();
    }

    private void fry() {
        System.out.println("炒啊炒啊炒到熟啊");
    }


    public abstract void pourSauce() ;

    public abstract void pourVegetable();

    private void heatOil() {
        System.out.println("热油");
    }

    private void pourOil() {
        System.out.println("倒油");
    }
}
