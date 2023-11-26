package com.rock.linkedlist06;

public class SinglyLinkedList {
    private Node head;



    public static class Node{
        private int data;

        private Node next;

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }
    }
}
