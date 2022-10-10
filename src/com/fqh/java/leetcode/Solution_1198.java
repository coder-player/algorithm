package com.fqh.java.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 海盗狗
 * @version 1.0
 * 1198. 找出所有行中最小公共元素[PLUS]
 */
public class Solution_1198 {

    public static void main(String[] args) {

    }

    public int smallestCommonElement(int[][] mat) {
        // 暴力解法 时间O(n^2) 空间 O(n)
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {
                map.put(mat[i][j], map.getOrDefault(mat[i][j], 0) + 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == mat.length) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
