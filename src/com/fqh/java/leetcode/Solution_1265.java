package com.fqh.java.leetcode;

/**
 * @author 海盗狗
 * @version 1.0
 * PLUS会员题
 * 1265. 逆序打印不可变链表
 * 输入：head = [1,2,3,4]
 * 输出：[4,3,2,1]
 * 给您一个不可变的链表，使用下列接口逆序打印每个节点的值：
 *
 * ImmutableListNode: 描述不可变链表的接口，链表的头节点已给出。
 * 您需要使用以下函数来访问此链表（您 不能 直接访问 ImmutableListNode）：
 *
 * ImmutableListNode.printValue()：打印当前节点的值。
 * ImmutableListNode.getNext()：返回下一个节点。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/print-immutable-linked-list-in-reverse
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_1265 {

    public static void main(String[] args) {

    }
    public void printLinkedListInReverse(ImmutableListNode head) {
        if(head == null) {
            return;
        }
        printLinkedListInReverse(head.getNext());
        head.printValue();
    }
}

interface ImmutableListNode {
    public void printValue(); // print the value of this node.
    public ImmutableListNode getNext(); // return the next node.
};