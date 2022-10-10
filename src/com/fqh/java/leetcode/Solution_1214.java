package com.fqh.java.leetcode;

import java.util.*;

/**
 * @author 海盗狗
 * @version 1.0
 * 1214. 查找两棵二叉搜索树之和 (PLUS)
 */
public class Solution_1214 {

    public static void main(String[] args) {

    }

    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        dfs(root1, list1);
        dfs(root2, list2);
        for(int i : list1) {
            int val = target - i;
            if(list2.contains(val)) {
                return true;
            }
        }
        for(int i : list2) {
            int val = target - i;
            if(list1.contains(val)) {
                return true;
            }
        }
        return false;
    }

    public void dfs(TreeNode root, List<Integer> list) {
        if(root == null) {
            return;
        }
        dfs(root.left, list);
        list.add(root.val);
        dfs(root.right, list);
    }
}
