package com.example.linked;

public class SingleLinkedList {
    /**
     *
     */


    // 做一个头指针
    private HeroNode head = new HeroNode(0,"","");

    // 1. 找到当前链表的最后节点
    // 2. 然后让该节点的next直接赋值为node
    public void add(HeroNode node){
        HeroNode temp = head;
        while (true){
            if (temp.next == null){
                break;
            }
            temp = temp.next;
        }
        temp.next = node;

    }

    public void addBySort(HeroNode node){

        HeroNode temp = head;

        boolean flag = false;

        while (true){
            if (temp.next == null){ // 移动到末尾,跳出循环
                break;
            }
            /**
             * 需要插入的node.id与末尾的temp.next.id 进行比较,
             * 如果 node.id > temp.next.id ,插入
             * 如果 node.id > temp.next.id ,进行互换
             */
            if (temp.next.id > node.id){
                break;
            }

            if(temp.next.id > node.id){
                break;
            } else if (temp.next.id == node.id) {
                flag = true;
                break;
            }

            temp = temp.next;
        }

        if (flag){
            System.out.printf("准备插入的英雄的编号 %d 已经存在了, 不能加入\n", node.id);
        } else {
            node.next = temp.next;
            temp.next = node;
        }


    }


    public void show() {
        if (head.next == null){
            System.out.println("链表为空");
            return;
        }

        HeroNode temp = head.next;

        while (true){
            if (temp == null){
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }
}

class testDemo{
    public static void main(String[] args) {
       SingleLinkedList singleLinkedList = new SingleLinkedList();
       HeroNode heroNode = new HeroNode(1,"宋江","及时雨");
       HeroNode heroNode1 = new HeroNode(2,"宋江2","及时雨2");
       singleLinkedList.addBySort(heroNode1);
       singleLinkedList.addBySort(heroNode);
       singleLinkedList.show();
    }
}
