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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode headNode = new ListNode(0);
        ListNode current = headNode;
        int carry = 0;
        while (l1.next != null || l2.next == null || carry != 0) {
            int sum = l1.val + l2.val + carry;
            carry = sum / 10;
            current = new ListNode(sum % 10);

        }
        return current.next;
    }
}
