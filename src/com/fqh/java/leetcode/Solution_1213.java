package com.fqh.java.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 海盗狗
 * @version 1.0
 *  1213. 三个有序数组的交集
 */
public class Solution_1213 {

    public static void main(String[] args) {

    }

    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        // 暴力解法哈希 时间O(n),空间O(n)
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
            map.put(arr2[i], map.getOrDefault(arr2[i], 0) + 1);
            map.put(arr3[i], map.getOrDefault(arr3[i], 0) + 1);
        }
        List<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 3) {
                res.add(entry.getKey());
            }
        }
        return res;
    }
}
