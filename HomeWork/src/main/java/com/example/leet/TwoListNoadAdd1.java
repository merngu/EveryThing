package com.example.leet;

/**
 * FileName: TwoListNoadAdd1
 * Author: bai
 * Date:   20242024/4/24下午2:23
 * Description:两数相加第一遍
 * <author> maziyu
 */
public class TwoListNoadAdd1 {
    public ListNode addSum(ListNode l1,ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0){
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

       return dummyHead.next;
    }
}
