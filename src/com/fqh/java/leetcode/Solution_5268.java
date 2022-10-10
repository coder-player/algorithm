package com.fqh.java.leetcode;

import java.util.*;

/**
 * @author 海盗狗
 * @version 1.0
 */
public class Solution_5268 {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {1, 1, 2, 2};

        System.out.println(findDifference(nums1, nums2));
    }


    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i : nums1) {
            if (!list1.contains(i)) {
                list1.add(i);
            }
        }
        for (int i : nums2) {
            if (!list2.contains(i)) {
                list2.add(i);
            }
        }
        int k = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (list1.contains(nums2[i])) {
                while (list1.get(k) != nums2[i]) {
                    k++;
                }
                list1.remove(k);
            }
        }
        k = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (list2.contains(nums1[i])) {
                while (list2.get(k) != nums1[i]) {
                    k++;
                }
                list2.remove(k);
            }
        }
        res.add(list1);
        res.add(list2);
        return res;
    }
}
