package com.biggw.niuke;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class 二叉树层次打印 {

    public static void main(String[] args) {
        // shift f6 批量修改变量
        二叉树层次打印 obj = new 二叉树层次打印();
        二叉树层次打印.TreeNode node1 = new 二叉树层次打印.TreeNode(8);
        二叉树层次打印.TreeNode node2 = new 二叉树层次打印.TreeNode(6);
        二叉树层次打印.TreeNode node3 = new 二叉树层次打印.TreeNode(10);
        二叉树层次打印.TreeNode node4 = new 二叉树层次打印.TreeNode(5);
        二叉树层次打印.TreeNode node5 = new 二叉树层次打印.TreeNode(7);
        二叉树层次打印.TreeNode node6 = new 二叉树层次打印.TreeNode(9);
        二叉树层次打印.TreeNode node7 = new 二叉树层次打印.TreeNode(11);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        二叉树层次打印.Solution solution = obj.new Solution();
        ArrayList<ArrayList<Integer>> print = solution.Print(node1);
        System.out.println(print);


    }

    public static class TreeNode {
        int val = 0;
        二叉树层次打印.TreeNode left = null;
        二叉树层次打印.TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public class Solution {
        public ArrayList<ArrayList<Integer>> Print(二叉树层次打印.TreeNode pRoot) {
            ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();

            if (pRoot == null) {
                return arrayList;
            }

            ArrayDeque<TreeNode> queue = new ArrayDeque<>();
            queue.add(pRoot);

            while (queue.size() != 0) {
                ArrayList<Integer> list = new ArrayList<>();
                ArrayDeque<TreeNode> queueTemp = new ArrayDeque<>();
                while (queue.size() != 0) {
                    二叉树层次打印.TreeNode node = queue.pop();
                    list.add(node.val);
                    if (node.left != null) queueTemp.add(node.left);
                    if (node.right != null) queueTemp.add(node.right);
                }
                queue = queueTemp;
                arrayList.add(list);
            }
            return arrayList;
        }

    }
}
