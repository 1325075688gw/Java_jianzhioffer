package com.biggw.niuke;

public class 二叉树的深度 {


    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public class Solution {
        public int TreeDepth(TreeNode root) {
            if (root == null ) {return 0;}
            int leftNum = TreeDepth(root.left);
            int rightNum = TreeDepth(root.right);
            return Math.max(leftNum, rightNum)+1;
        }
    }
}
