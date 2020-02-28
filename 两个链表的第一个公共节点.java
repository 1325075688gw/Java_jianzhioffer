package com.biggw.niuke;

import java.util.HashSet;
import java.util.Set;

public class 两个链表的第一个公共节点 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public class Solution {
        public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

            Set<ListNode> listNodes = new HashSet<>();
            while (pHead1 != null) {
                listNodes.add(pHead1);
                pHead1 = pHead1.next;
            }
            while (pHead2 != null) {
                boolean contains = listNodes.contains(pHead2);
                if (contains == true) {
                    return pHead2;
                }
                pHead2 = pHead2.next;
            }
            return null;
        }

        public ListNode FindFirstCommonNode2(ListNode pHead1, ListNode pHead2) {

            ListNode p1 = pHead1;
            ListNode p2 = pHead2;
            if (pHead1==null && pHead2==null)
                return null;
            if (pHead1==null || pHead2==null) {
                return null;
            }
            // 第一次比较，两个同时为空不。只有一个为空
            while (p1 !=p2 ) {
                // 第一次是进来，如果有个为空
                p1 = p1!=null?p1.next:pHead2;
                p2 = p2!=null?p2.next:pHead1;
            }
            return p1;
        }
    }
}
