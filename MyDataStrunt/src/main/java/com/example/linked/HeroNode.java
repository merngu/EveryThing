package com.example.linked;



public class HeroNode {
    public Integer id;
    public String name;
    public String nickname;
    public HeroNode next;

    public HeroNode(Integer id, String name, String nickname) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return id.toString() + " " +name.toString() + " " + nickname.toString();
    }
}
