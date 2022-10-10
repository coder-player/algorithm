package com.fqh.java.homework.finalwork;

/**
 * @author 我劝你荔枝_FQH
 * @version 1.0
 * Date: 2022/6/15 11:18:21
 */
public class TreeDemo {

    public static void main(String[] args) {

        char[] postOrder = {'E', 'F', 'K', 'J', 'I', 'G', 'H', 'D', 'C', 'B', 'A'};
        char[] inOrder = {'E', 'F', 'B', 'I', 'J', 'K', 'G', 'C', 'H', 'D', 'A'};

        TreeNode root = buildTree(inOrder, postOrder);
//        System.out.println(node);
        dfs(root);
    }

    public static TreeNode buildTree(char[] inorder, char[] postorder) {
        return build(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }


    public static void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data);
        dfs(root.left);
        dfs(root.right);
    }

    public static TreeNode build(char[] inorder, int inStart, int inEnd, char[] postorder, int postStart, int postEnd) {
        if (postStart > postEnd) {
            return null;
        }
        char rootVal = postorder[postEnd];
        int index = 0;
        for (int i = inStart; i <= inEnd ; i++) {
            if (inorder[i] == rootVal) {
                index = i;
                break;
            }
        }

        int leftSize = index - inStart;
        TreeNode root = new TreeNode(rootVal);
        root.left = build(inorder, inStart, index - 1, postorder, postStart, postStart + leftSize - 1);
        root.right = build(inorder, index + 1, inEnd, postorder, postStart + leftSize, postEnd - 1);

        return root;
    }

    static class TreeNode {
        char data;
        TreeNode left;
        TreeNode right;

        public TreeNode(char data) {
            this.data = data;
        }
    }
}
