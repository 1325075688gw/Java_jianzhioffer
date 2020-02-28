package com.biggw.niuke;

//题目描述: 输入一个链表，输出该链表中倒数第k个结点。
public class 链表中倒数第k个节点 {


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public class Solution {
        public ListNode FindKthToTail(ListNode head, int k) {
            if (head == null) {
                return head;
            }
            if (k == 0) {
                return null;
            }

            ListNode fast = head;
            ListNode slow = head;
            // 之所以fast先只移动k-1次，因为，倒数第2个元素。则最后结果fast和slow只相差1.也就是说倒数第k个，则fast和slow相距k-1即可
            // 当k>=2时候进行
            while (k > 1) {
                if (fast.next == null) {
                    return null;
                }
                fast = fast.next;
                k--;
            }
            // 当k==1时候进行
            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }

            return slow;
        }
    }

    public static void main(String[] args) {

    }
}
