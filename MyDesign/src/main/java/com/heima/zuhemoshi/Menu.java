package com.heima.zuhemoshi;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent{

    private List<MenuComponent> menuComponentList;

    public Menu(String name,int level){
        this.level = level;
        this.name = name;
        menuComponentList = new ArrayList<MenuComponent>();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponentList.get(i);
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.println("--");
        }
        System.out.println(name);
        for (MenuComponent menuComponent:
             menuComponentList) {
            menuComponent.print();
        }
    }
}
