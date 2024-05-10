package com.example.leet;

/**
 * FileName: TwoListNoadAdd2
 * Author: bai
 * Date:   20242024/4/25上午10:03
 * Description:第二遍
 * <author> maziyu
 */
public class TwoListNoadAdd2 {

    public ListNode add(ListNode l1,ListNode l2){
        ListNode dummpyHead = new ListNode(0);
        ListNode current = dummpyHead;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0){
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        return dummpyHead.next;
    }
}
