package com.fqh.java.homework.finalwork;

import com.fqh.java.leetcode.TreeNode;

import java.util.*;

/**
 * @author 我劝你荔枝_FQH
 * @version 1.0
 * Date: 2022/6/16 09:37:28
 */
public class HuffmanDemo {

    public static void main(String[] args) {

        List<TreeNode> list = new ArrayList<>();
        list.add(new TreeNode(6));
        list.add(new TreeNode(3));
        list.add(new TreeNode(7));
        list.add(new TreeNode(4));
        list.add(new TreeNode(5));
        list.add(new TreeNode(5));

        TreeNode treeNode = buildTree(list);
        System.out.println(treeNode);
    }

    /** *****************
     *
     * A B C D E
     * 4 9 1 3 2
     * ***************** */

    public static TreeNode buildTree(List<TreeNode> list) {
        while (list.size()> 1) {

            list.sort(((o1, o2) -> o1.val - o2.val));

            TreeNode node1 = list.get(0);
            TreeNode node2 = list.get(1);

            TreeNode parent = new TreeNode(node1.val + node2.val);
            parent.left = node1;
            parent.right = node2;

            list.remove(node1);
            list.remove(node2);
            list.add(parent);
        }
        return list.get(0);
    }
}
