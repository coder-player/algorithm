package com.fqh.java.leetcode;

import java.util.*;

/**
 * @author 海盗狗
 * @version 1.0
 * 1762. 能看到海景的建筑物
 * 输入：heights = [4,2,3,1]
 * 输出：[0,2,3]
 * 解释：1 号建筑物看不到海景，因为 2 号建筑物比它高
 */
public class Solution_1762 {

    public static void main(String[] args) {

        int[] heights = {4, 2, 3, 1};
        findBuildings(heights);
    }

    public static int[] findBuildings(int[] heights) {
        // 维护单调递减栈
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < heights.length; i++) {
            while(!stack.isEmpty() && heights[stack.peek()] <= heights[i]) {
                stack.pop();
            }
            stack.push(i);
        }
        int[] ans = new int[stack.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}
