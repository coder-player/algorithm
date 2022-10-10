package com.fqh.java.leetcode;

import javax.swing.*;
import java.util.List;

/**
 * @author 海盗狗
 * @version 1.0
 *
 * 2. 两数相加
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 */
public class Solution_2 {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(3);
        l1.next = node1;
        node1.next = node2;

        ListNode l2 = new ListNode(5);
        ListNode node11 = new ListNode(6);
        ListNode node22 = new ListNode(4);
        l2.next = node11;
        node11.next = node22;
        System.out.println(addTwoNumbers(l1, l2));

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q  = l2;
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        int val = 0;
        int incr = 0;
        while(p != null || q != null) {
            val = incr;
            if(p != null) {
                val += p.val;
                p = p.next;
            }
            if(q != null) {
                val += q.val;
                q = q.next;
            }
            incr = val / 10;
            val = val % 10;
            ListNode node = new ListNode(val);
            cur.next = node;
            cur = cur.next;
        }
        return dummy.next;
    }
}
