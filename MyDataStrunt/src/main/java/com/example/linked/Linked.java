package com.example.linked;

public class Linked {

    // 初始化一个头节点。头节点不要动，不存放具体的数据
    private HeroNode head = new HeroNode(0,"","");

    public void add(HeroNode heroNode){

        // 1. 先判断是否链表尾部
        // 2. 如果不是就

        HeroNode temp = head;

        while(true){
            // 如果是null表示是链表最后
            if (temp.next == null){
              break;
            } else {
                temp = temp.next;
            }
        }
        temp.next = heroNode;
    }

    public void list(){


        // 先判断链表是否为空
        if (head.next == null ){
            System.out.println("链表为空");
            return;
        }

        HeroNode temp = head.next;

        while (true){
            if (temp == null){
                break;
            } else {
                System.out.println(temp.toString());
            }
            temp = temp.next;
        }

    }
}
