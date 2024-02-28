package com.example.linked;

public class danlianbiao {


    // 添加头节点
    HeroNode head = new HeroNode(0, "", "");

    public void add(HeroNode heroNode) {
        HeroNode temp = head;
        while (true) {
            if (temp.next == null) {
                temp.next = heroNode;
                break;
            }
            temp = temp.next;

        }

    }

    public void delete(HeroNode heroNode) {
        HeroNode temp = head;
        while (true) {

        }
    }

    public void modify(HeroNode heroNode) {
        HeroNode temp = head;
        while (true) {
            if (temp.id == heroNode.id) {
                temp.id = heroNode.id;
                temp.name = heroNode.name;
                temp.nickname = heroNode.nickname;
                break;
            }
            temp = temp.next;
        }
    }

    public void find(int id) {
        HeroNode temp = head;
        while (true) {
            if (temp.id == id) {
                System.out.println(temp.toString());
                break;
            }
            temp = temp.next;

        }

    }

    public void list() {
        HeroNode temp = head.next;
        while (true) {
            if (temp.next == null) {
                System.out.println(temp.toString());
                break;
            }
        }
    }
}