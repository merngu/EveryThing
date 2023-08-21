package com.example.linked;

public class LinkedDemo {
    public static void main(String[] args) {
        HeroNode heroNode = new HeroNode(1, "宋江", "及时雨");
        HeroNode heroNode2 = new HeroNode(2, "宋江2", "及时雨2");
        Linked linked = new Linked();
        linked.add(heroNode);
        linked.add(heroNode2);
        linked.list();
    }
}
