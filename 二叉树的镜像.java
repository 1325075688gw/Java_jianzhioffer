package com.biggw.niuke;

public class 二叉树的镜像 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public class Solution {
        public void Mirror(TreeNode root) {

            if (root == null) {
                return ;
            }
            TreeNode treeNode;
            treeNode = root.right;
            root.right = root.left;
            root.left = treeNode;
            if (root.left!=null) {
                Mirror(root.left);
            }
            if (root.right !=null) {
                Mirror(root.right);
            }
        }
    }
}
