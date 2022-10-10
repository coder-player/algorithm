package com.fqh.java.homework.work;

import com.fqh.java.leetcode.TreeNode;

import java.util.Random;

/**
 * @author 海盗狗
 * @version 1.0
 */
public class WorkTest01 {

    public static void main(String[] args) {
        ListNode one = questionOne();
        questionTwo(one);
        System.out.println("\n***************反转后*****************");
        one.next = questionThree(one.next);
        questionTwo(one);
    }

    static Random random = new Random();

//    问题一
    public static ListNode questionOne() {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        for (int i = 0; i < 10; i++) {
            cur.next = new ListNode(random.nextInt(10));
            cur = cur.next;
        }
        return head;
    }
//    问题二
    public static void questionTwo(ListNode head) {
        ListNode cur = head.next;
        while (cur != null) {
            System.out.print(cur);
            cur = cur.next;
        }
    }
//    问题三
    public static ListNode questionThree(ListNode head) {
//        递归
        if (head == null || head.next == null) {
            return head;
        }
        ListNode last = questionThree(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

//    节点类
    static class ListNode {
        int data;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int data) {
            this.data = data;
        }

        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }
        @Override
        public String toString() {
            return data + "--->";
        }
    }
}
