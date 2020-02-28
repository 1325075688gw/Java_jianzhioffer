package com.biggw.niuke;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class 重建二叉树 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {

    }

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if(pre.length == 0){
            return null;
        }
        int indexValue = pre[0];
        int index = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] == indexValue) {
                index = i;
                break;
            }
        }
        TreeNode treeNode = new TreeNode(indexValue);
        treeNode.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, 1+index), Arrays.copyOfRange(in, 0, index));
        treeNode.right = reConstructBinaryTree(Arrays.copyOfRange(pre, 1+index, pre.length), Arrays.copyOfRange(in, index+1,in.length));

        return treeNode;
    }

}
