package com.biggw.niuke;

public class 判断是否是平衡二叉树 {
    public class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public class Solution {
        public boolean IsBalanced_Solution(TreeNode root) {
            if (root == null) return true;
            if (root.left ==null && root.right ==null) return true;

            int leftNum = high(root.left);
            int rightNum = high(root.right);
            int res = Math.abs(leftNum-rightNum);
            return res<1;
        }

        public int high(TreeNode root) {
            if (root==null) return 0;
            return Math.max(high(root.left),high(root.right))+1;
        }
    }
}
