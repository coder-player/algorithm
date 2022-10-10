package com.fqh.java.leetcode;

/**
 * @author 海盗狗
 * @version 1.0
 * 6027. 统计数组中峰和谷的数量
 * 周赛1
 * nums = [2,4,1,1,6,5] : 3
 * nums = [6,6,5,5,4,1]  : 0
 */
public class Solution_6027 {

    public static void main(String[] args) {

        int[] nums = {2, 4, 1, 1, 6, 5};
        System.out.println(countHillValley(nums));

    }

    public static int countHillValley(int[] nums) {

        int j = 0;
        int count = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[j]) {
                j++;
                continue;
            }
            if (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                continue;
            }
            if(i + 1 < nums.length && nums[i] > nums[j] && nums[i] > nums[i + 1]) {
                count++;
                j = i;
                continue;
            }
            if(i + 1 < nums.length && nums[i] < nums[j] && nums[i] < nums[i + 1]) {
                count++;
                j = i;
            }
        }
        return count;
    }
}
