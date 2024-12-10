package com.example.leet;

/**
 * FileName: TwoListNodeAdd
 * Author: bai
 * Date:   20242024/4/24上午10:06
 * Description:链表之和相加
 * <author> maziyu
 */
public class TwoListNodeAdd {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        // 创建一个虚拟头节点dummyHead,并初始化当前节点current为dummyHead
//        ListNode dummyHead = new ListNode(0);
//        ListNode current = dummyHead;
//
//        int carry = 0; // 初始化进位为0
//
//        while (l1 != null || l2 != null || carry != 0) {
//            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
//            carry = sum / 10; // 计算新的进阶位
//            current.next = new ListNode(sum % 10); //创建新的节点并添加到结果链表中
//            current = current.next; // 更新当前节点为新节点
//            l1 = (l1 != null) ? l1.next : null; // 移动l1指针到下一节点
//            l2 = (l2 != null) ? l2.next : null; // 移动l2指针到下一节点
//        }
//
//        return dummyHead.next; // 返回虚拟头节点的下一个节点作为结果链表的起始节点
//    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode headNode = new ListNode(0);
        ListNode current = headNode;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0)  + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            l1=(l1!=null ?l1.next : null);
            l2=(l2!=null ?l2.next : null);
            current = current.next;
        }
        return headNode.next;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);


        TwoListNodeAdd solution = new TwoListNodeAdd();
        ListNode result = solution.addTwoNumbers(l1, l2);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}



