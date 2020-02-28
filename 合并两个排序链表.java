package com.biggw.niuke;

public class 合并两个排序链表 {


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

    }

    public static void main(String[] args) {
        合并两个排序链表 obj = new 合并两个排序链表();

    }

    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1==null && list2==null) {
            return null;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode listNode = new ListNode(0);
        ListNode dummyHead = listNode;
        while (list1!=null && list2!=null) {
            if (list1.val < list2.val) {
                listNode.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                listNode.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            listNode = listNode.next;
        }
        if (list1!=null) {
            listNode.next = list1;
        }
        if (list2!=null) {
            listNode.next = list2;
        }


        return dummyHead.next;
    }
}
