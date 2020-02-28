package com.biggw.niuke;

//题目描述:输入一个链表，反转链表后，输出新链表的表头。
public class 反转链表 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        反转链表 obj = new 反转链表();
        Solution solution = obj.new Solution();
        ListNode listNode = solution.ReverseList(node1);
        solution.print(listNode);

    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public class Solution {
        public ListNode ReverseList(ListNode head) {

            if (head == null) {
                return head;
            }
            if (head.next == null) {
                return head;
            }

            ListNode newHead = ReverseList(head.next);
            head.next.next = head;
            head.next = null;


            return newHead;
        }

        public void print(ListNode head) {
            while (head!=null) {
                System.out.println(head.val);
                head = head.next;
            }
        }
    }
}
