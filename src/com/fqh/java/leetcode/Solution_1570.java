package com.fqh.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 海盗狗
 * @version 1.0
 * 1570. 两个稀疏向量的点积 [PLUS]
 * 输入：nums1 = [1,0,0,2,3], nums2 = [0,3,0,4,0]
 * 输出：8
 * 解释：v1 = SparseVector(nums1) , v2 = SparseVector(nums2)
 * v1.dotProduct(v2) = 1*0 + 0*3 + 0*0 + 2*4 + 3*0 = 8
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/dot-product-of-two-sparse-vectors
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_1570 {

    public static void main(String[] args) {
    }
}


class SparseVector {
    int[] nums;
    SparseVector(int[] nums) {
        this.nums = nums;
    }

    // Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        int res = 0;
        for(int i = 0; i < nums.length; i++) {
            res += this.nums[i] * vec.nums[i];
        }
        return res;
    }
}

// Your SparseVector object will be instantiated and called as such:
// SparseVector v1 = new SparseVector(nums1);
// SparseVector v2 = new SparseVector(nums2);
// int ans = v1.dotProduct(v2);