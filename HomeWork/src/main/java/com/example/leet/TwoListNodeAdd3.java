package com.example.leet;

import java.util.ArrayList;

/**
 * FileName: TwoListNodeAdd3
 * Author: bai
 * Date:   20242024/4/30上午9:48
 * Description:第3遍
 * <author> maziyu
 */
public class TwoListNodeAdd3 {
    public ListNode addListNode(ListNode l1,ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 !=null || l2 != null || carry!=0){

           int sum = (l1 !=null ? l1.val : 0) + (l1 !=null ? l1.val : 0) + carry;
           carry = sum/10;
           current = new ListNode(sum%10);
           l1 = (l1!=null) ? l1.next : null;
           l2 = (l2!=null) ? l2.next : null;
           current = current.next;

        }

        return dummyHead.next;
    }
}
