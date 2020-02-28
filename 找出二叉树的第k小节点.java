package com.biggw.niuke;

public class 找出二叉树的第k小节点 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if (pRoot ==null){
            return null;
        }

        int leftNumber = number(pRoot.left);
        if ( leftNumber== k-1) {
            return pRoot;
        }
        else if (leftNumber < k-1) {
            return KthNode(pRoot.right, k-leftNumber-1);
        } else {
            return KthNode(pRoot.left, k);
        }
    }

    public int number(TreeNode root) {
        if (root==null) return 0;
        return number(root.left) + number(root.right) +1;
    }
}
