package com.fqh.java.leetcode;

import java.util.TreeMap;

/**
 * @author 我劝你荔枝_FQH
 * @version 1.0
 * Date: 2022/5/19 08:46:49
 * 2265. 统计值等于子树平均值的节点数
 */
public class Solution_2265 {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(8);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(0);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(6);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.right = node5;
        System.out.println(averageOfSubtree(root));
    }

    static int count = 0;
    public static int averageOfSubtree(TreeNode root) {
        dfs(root);
        return count;
    }
    static int path = 0;
    public static void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            count++;
        }
        if (root.right != null && root.left != null && count != 0) {
            if (root.val == path / count) {
                count++;
            }
        }
        dfs(root.left);
        dfs(root.right);
        path += root.val;
    }
}
