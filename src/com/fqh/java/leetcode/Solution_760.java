package com.fqh.java.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 海盗狗
 * @version 1.0
 *  760. 找出变位映射[PLUS]
 */
public class Solution_760 {

    public static void main(String[] args) {

    }

    public int[] anagramMappings(int[] nums1, int[] nums2) {
        // 普通哈希 时间O(n) 空间O(n)
        int[] ans = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }
        for(int i = 0; i < nums1.length; i++) {
            if(map.containsKey(nums1[i])) {
                ans[i] = map.get(nums1[i]);
            }
        }
        return ans;
    }
}
