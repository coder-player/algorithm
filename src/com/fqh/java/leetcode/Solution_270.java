package com.fqh.java.leetcode;

import java.util.TreeMap;

/**
 * @author 海盗狗
 * @version 1.0
 * 270. 最接近的二叉搜索树值[PLUS]
 */
public class Solution_270 {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
//        TreeNode node2 = new TreeNode(5);
//        TreeNode node3 = new TreeNode(1);
//        TreeNode node4 = new TreeNode(3);
//        root.left = node1;
//        root.right = node2;
//        node1.left = node3;
//        node1.right = node4;
        root.right = node1;

        double target = 3.428571;
        System.out.println(closestValue(root, target));
    }

    static int closeVal = 0;
    static double minVal = Double.MAX_VALUE;
    public static int closestValue(TreeNode root, double target) {
        dfs(root, target);
        return closeVal;
    }

    public static void dfs(TreeNode root, double target) {
        if (root == null) {
            return;
        }
        if (minVal > Math.abs(root.val - target)) {
            minVal = Math.abs(root.val - target);
            closeVal = root.val;
        }
        dfs(root.left, target);
        dfs(root.right, target);
    }
}
