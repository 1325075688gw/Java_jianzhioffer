package com.biggw.niuke;

public class 删除链表中重复的节点_保留一个节点 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode deleteDuplication(ListNode pHead) {;
        if (pHead==null) {
            return pHead;
        }

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = pHead;
        ListNode behind = dummyHead;
        ListNode cur = pHead;

        while (cur!=null) {
            if (cur.next!=null && (cur.val==cur.next.val)) {
                while (cur.next!=null && (cur.val==cur.next.val)) {
                    cur = cur.next;
                }
                behind.next = cur;
            } else {
                cur = cur.next;
                behind = behind.next;
            }
        }

        return dummyHead.next;
    }

}
