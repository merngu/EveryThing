package com.example.linked;

public class LinkedDemo {
    public static void main(String[] args) {
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");
        Linked linked = new Linked();
        linked.addByOrder(hero1);
        linked.addByOrder(hero2);
        linked.addByOrder(hero4);
        linked.addByOrder(hero3);
        linked.list();
//        linked.delete(1);
//        linked.list();
        System.out.println("===============");
//        linked.delete(3);
//        linked.list();

        linked.getLinkedNum();
    }
}
