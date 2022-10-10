package com.fqh.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 海盗狗
 * @version 1.0
 * 1469. 寻找所有的独生节点
 * 输入：root = [1,2,3,null,4]
 * 输出：[4]
 * 解释：浅蓝色的节点是唯一的独生节点。
 * 节点 1 是根节点，不是独生的。
 * 节点 2 和 3 有共同的父节点，所以它们都不是独生的。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-all-the-lonely-nodes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_1469 {

    public static void main(String[] args) {

    }

    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return dfs(root, list);
    }

    public List<Integer> dfs(TreeNode root, List<Integer> list) {
        if(root == null) {
            return list;
        }
        // 情况1 : 左子节点为null
        if(root.left == null && root.right != null) {
            list.add(root.right.val);
        }
        // 情况2 : 右子节点为null
        if(root.right == null && root.left != null) {
            list.add(root.left.val);
        }
        dfs(root.left, list);
        dfs(root.right, list);
        return list;
    }
}
