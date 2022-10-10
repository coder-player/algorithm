package com.fqh.java.homework.work;

/**
 * @author 海盗狗
 * @version 1.0
 */
public class WorkTest02 {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(1);
        Node node4 = new Node(5);
        Node node5 = new Node(4);
        Node node6 = new Node(2);


        list.insert(node1).insert(node3).insert(node2).insert(node4).insert(node6).insert(node5);
        System.out.println("去重前=====================");
        list.printList();
        System.out.println("\n去重后=====================");
        list = list.deleteDuplicates(list.getHead());
        list.printList();

    }

    static class LinkedList {
        //    头节点
        private Node head = new Node(-1);

        public LinkedList() {
        }

        public void printList() {
            Node cur = head.next;
            while (cur != null) {
                System.out.print(cur.data + "---->");
                cur = cur.next;
            }
        }
        //    插入节点[插入后仍然保持有序]
        public LinkedList insert(Node node) {
            if (head.next == null) {
                head.next = node;
                return this;
            }
            Node cur = head;
            while (cur.next != null) {
                if (cur.next.data > node.data) {
//                找到应该插入的位置
                    node.next = cur.next;
                    cur.next = node;
                    return this;
                }
//            值相等的情况
                if (cur.next.data == node.data) {
                    node.next = cur.next.next;
                    cur.next.next = node;
                    return this;
                }
                cur = cur.next;
            }
            cur.next = node;
            return this;
        }

        //    删除重复元素
        public LinkedList deleteDuplicates(Node head) {
            if (head == null) {
                return null;
            }
            Node dummy = new Node(-1);
            Node temp = head.next;
            Node cur = dummy;

            while (temp != null) {
                if (temp.next != null && temp.data == temp.next.data) {
                    temp = temp.next;
                } else {
                    cur.next = temp;
                    cur = cur.next;
                    temp = temp.next;
                }
            }
            head.next = dummy.next;
            return this;
        }

        public Node getHead() {
            return head;
        }
    }

    static class Node {
        int data;
        Node next;

        public Node() {
        }

        public Node(int data) {
            this.data = data;
        }
    }
}