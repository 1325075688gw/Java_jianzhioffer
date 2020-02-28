package com.biggw.niuke;

import java.security.PublicKey;
import java.util.ArrayList;

public class 二叉树中和为某一值得路径 {
    ArrayList<ArrayList<Integer>> arrayLists = new  ArrayList<ArrayList<Integer>>();

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(12);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(7);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right =node5;

        二叉树中和为某一值得路径 obj = new 二叉树中和为某一值得路径();
        ArrayList<ArrayList<Integer>> lists = obj.FindPath(node1, 22);
        System.out.println(lists);
    }

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        func(root, target, arrayList);
//        System.out.println(arrayLists);
        return arrayLists;
    }

    public void func(TreeNode root, int res, ArrayList<Integer> arrayList) {
        res -= root.val;
        arrayList.add(root.val);
        if (root.left == null && root.right == null &&res==0) {
            arrayLists.add(new ArrayList<>(arrayList));
//            System.out.println(arrayLists);
            return;
        }


        if (root.left!=null) {
            func(root.left, res, arrayList);
        }
        if (root.right!=null) {
            func(root.right, res, arrayList);
        }
        arrayList.remove(arrayList.size()-1);
    }

}
