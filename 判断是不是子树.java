package com.biggw.niuke;


//题目描述：输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
public class 判断是不是子树 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

    }


    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1==null || root2 ==null) {
            return false;
        }
        boolean subTree = isSubTree(root1.left, root2) || isSubTree(root1.right, root2) || isSubTree(root1,root2);
        return subTree;
    }

    public boolean isSubTree(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1==null) {
            return false;
        }
        if (root2==null) {
            return true;
        }
        if (root1.val != root2.val){
            return false;
        }

        return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
    }
}
