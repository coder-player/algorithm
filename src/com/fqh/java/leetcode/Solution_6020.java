package com.fqh.java.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 海盗狗
 * @version 1.0
 * 双周赛第一题
 * 6020. 将数组划分成相等数对
 */
public class Solution_6020 {

    public static void main(String[] args) {

        int[] nums = {3, 2, 3, 2, 2, 2};

        System.out.println(divideArray(nums));
    }

    public static boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
