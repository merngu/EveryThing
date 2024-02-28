package com.heima.zuhemoshi;

public class MenuItem extends MenuComponent{
    public MenuItem(String name,int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.println("--");
        }
        System.out.println(name);
    }
}
