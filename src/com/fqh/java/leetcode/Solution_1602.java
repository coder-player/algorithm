package com.fqh.java.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 海盗狗
 * @version 1.0
 * 1602. 找到二叉树中最近的右侧节点[PLUS]
 */
public class Solution_1602 {

    public static void main(String[] args) {

    }

    public TreeNode findNearestRightNode(TreeNode root, TreeNode u) {
        //bfs
        if(root == null) {
            return null;
        }
        Queue<TreeNode> queue= new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int n = queue.size();
            for(int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                if(node.val == u.val) {
                    if(i == n - 1) {
                        return null;
                    }
                    return queue.poll();
                }
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return null;
    }
}
