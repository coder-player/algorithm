package com.fqh.java.leetcode;

import java.util.*;

/**
 * @author 比奇堡海滩
 * @version 1.0
 * 501. 二叉搜索树中的众数
 * 给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）。
 */
public class Solution_501 {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(1);
        root.left = node3;
        root.right = node1;
        node1.left = node2;

        findMode(root);
    }

    public static int[] findMode(TreeNode root) {
        if (root.left == null && root.right == null) {
            return new int[] {root.val};
        }
        //K-节点的值, V-节点出现的次数
        Map<Integer, Integer> map = new HashMap<>();
        dfs(root, map);

        //将map按照V从大到小排序
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(((o1, o2) -> o2.getValue() - o1.getValue()));

        int maxVal = list.get(0).getValue();
        List<Integer> res = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : list) {
            if (entry.getValue() != maxVal) {
                break;
            }
            res.add(entry.getKey());
        }
//        return res.stream().mapToInt(Integer::intValue).toArray();
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
    public static void dfs(TreeNode root, Map<Integer, Integer> map) {
        if (root == null) {
            return;
        }
        dfs(root.left, map);
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        dfs(root.right, map);
    }
}
