package com.biggw.niuke;

import javax.swing.*;

public class 判断是否是对称二叉树 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) {
            return true;
        }
        return isBoolean(pRoot.left, pRoot.right);
    }

    public boolean isBoolean(TreeNode root1, TreeNode root2) {
        if (root1==null && root2==null){
            return true;
        }
        if (root1 != null && root2 !=null && root1.val == root2.val) {
            return isBoolean(root1.left, root2.right) && isBoolean(root1.right, root2.left);
        }
        else {
            return false;
        }
    }
}
