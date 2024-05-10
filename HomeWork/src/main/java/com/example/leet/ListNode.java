package com.example.leet;

public class ListNode {
    int val;
    ListNode next;


    ListNode(int val) {
        if (val < 0 || val >9){
            throw new IllegalArgumentException("Invalid value for ListNode. It should be a digit between 0 and 9.");
        }
        this.val = val;
    }

}
