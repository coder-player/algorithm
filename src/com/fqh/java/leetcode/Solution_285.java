package com.fqh.java.leetcode;

/**
 * @author 海盗狗
 * @version 1.0
 * 285. 二叉搜索树中的中序后继 [PLUS]
 */
public class Solution_285 {

    public static void main(String[] args) {

    }

    public static TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root == null) {
            return null;
        }
        if (root.val > p.val) {
            inorderSuccessor(root.left, p);
        }
        if (root.val < p.val) {
            inorderSuccessor(root.right, p);
        }

        if (root.val == p.val) {
            if (root.right == null) {
                return root;
            }
        }

        return null;
    }
}
