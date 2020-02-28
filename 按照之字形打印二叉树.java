package com.biggw.niuke;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

//题目描述：请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
public class 按照之字形打印二叉树 {


    public static void main(String[] args) {
        按照之字形打印二叉树 obj = new 按照之字形打印二叉树();
        TreeNode node1 = new TreeNode(8);
        TreeNode node2 = new TreeNode(6);
        TreeNode node3 = new TreeNode(10);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(7);
        TreeNode node6 = new TreeNode(9);
        TreeNode node7 = new TreeNode(11);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right =node5;
        node3.left = node6;
        node3.right = node7;
        Solution solution = obj.new Solution();
        ArrayList<ArrayList<Integer>> print = solution.Print(node1);
        System.out.println(print);


    }

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public class Solution {
        public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
            ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();

            if (pRoot == null) {
                return arrayList;
            }

            ArrayDeque<TreeNode> queue = new ArrayDeque<>();
            queue.add(pRoot);
            boolean flag = true;

            while (queue.size() != 0) {
                ArrayList<Integer> list = new ArrayList<>();
                ArrayDeque<TreeNode> queueTemp = new ArrayDeque<>();
                while (queue.size() != 0) {
                    TreeNode node = queue.pollLast();
                    list.add(node.val);
                    if (flag!=false) {
                        if (node.left != null) queueTemp.add(node.left);
                        if (node.right != null) queueTemp.add(node.right);
                    } else {
                        if (node.right != null) queueTemp.add(node.right);
                        if (node.left != null) queueTemp.add(node.left);
                    }
                }
                flag = !flag;
                queue = queueTemp;
                arrayList.add(list);

            }
            return arrayList;
        }

    }
}
