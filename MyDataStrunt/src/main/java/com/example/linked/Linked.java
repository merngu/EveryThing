package com.example.linked;

public class Linked {

    // 初始化一个头节点。头节点不要动，不存放具体的数据
    private HeroNode head = new HeroNode(0,"","");

    public void add(HeroNode heroNode){
        HeroNode pin = head;

        while(true){
            if (pin.next == null){

                break;
            }
            pin = pin.next;
        }

    }

    public void addByOrder(HeroNode heroNode){

        HeroNode temp = head;

        boolean flag = false;

        while (true) {

            // 链表到最后
            if(temp.next == null){
                break;
            }

            if ( temp.next.id > heroNode.id ) {
               break;
            } else if (temp.next.id == heroNode.id) {
                flag = true;
                break;
            }
            temp = temp.next;
        }

        if ( flag ){
            System.out.printf("准备插入的英雄的编号 %d 已经存在了, 不能加入\n", heroNode.id);
        } else {
           // 插入到链表中，temp的后面
           // 1. 先把 heroNode的的next替换为 temp 的 next
           heroNode.next = temp.next;
           // 2. 再把新生成的 heroNode 放在temp之后
           temp.next = heroNode;

        }


    }

    public void delete(int id){

        // 创建一个临时表用于存储临时数据
           HeroNode temp = head;

        // 找到要删除的序号
        while(true){
            if (temp.next == null){
                break;
            }
            if (temp.next.id == id){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }

    }

    public void update(){

    }


    public void find(int id){
        HeroNode temp = head;
        while (true) {
            if (temp.next.id == id){
                temp = temp.next;
                temp.next = null;
                break;
            }
            temp = temp.next;
        }

    }

    public void getLinkedNum(){
        HeroNode temp = head.next;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        System.out.println("count = " + count);

    }


    public void list(){
        HeroNode pin = head.next;
        while (true){
            if (pin == null){

                break;
            }
            System.out.println(pin);
            pin = pin.next;
        }
    }

}
