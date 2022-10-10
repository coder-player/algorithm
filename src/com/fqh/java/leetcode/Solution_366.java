package com.fqh.java.leetcode;

import java.util.*;

/**
 * @author 海盗狗
 * @version 1.0
 * 366. 寻找二叉树的叶子节点 [PLUS]
 * 输入: [1,2,3,4,5]
 *  
 *           1
 *          / \
 *         2   3
 *        / \
 *       4   5
 *
 * 输出: [[4,5,3],[2],[1]]
 */
public class Solution_366 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;

        findLeaves(root);
    }

    public static List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(root, res, list);
        System.out.println(list);
        return null;
    }

    public static void dfs(TreeNode root, List<List<Integer>> res, List<Integer> list) {
        if (root == null) {
            return;
        }
        dfs(root.right, res, list);
        dfs(root.left, res,list);
        list.add(root.val);
    }
}
