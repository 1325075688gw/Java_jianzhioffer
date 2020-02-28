package com.biggw.niuke;


//题目描述：在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
public class 删除链表中重复的节点 {

     public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public class Solution {
        public ListNode deleteDuplication(ListNode pHead)
        {
            if (pHead!=null) {
                return pHead;
            }


            ListNode dummyHead = new ListNode(0);
            dummyHead.next = pHead;

            ListNode beh = dummyHead;
            ListNode cur = pHead;

            while (cur!=null) {
                if (cur.next!=null && (cur.val == cur.next.val)){
                    while (cur.next!=null && (cur.val == cur.next.val)) {
                        cur = cur.next;
                    }
                    // 注意最后一次出来时候，cur指向的就是重复的最后一个节点，主要可以看while (cur.next!=null && (cur.val == cur.next.val))这句话
                    beh.next = cur;
                } else {
                    beh = beh.next;
                    cur =cur.next;
                }
            }
            return dummyHead.next;

        }
    }

}
