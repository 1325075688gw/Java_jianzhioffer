package com.biggw.niuke;

public class 二叉树的下一个节点 {
    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }


    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {

        if (pNode.right!=null) {
            pNode = pNode.right;
            while (pNode.left!=null) {
                pNode = pNode.left;
            }
            return pNode;
        }
        while (pNode.next!=null && (pNode == pNode.next.right)) {
            pNode = pNode.next;
        }
        return pNode.next;
    }
}
