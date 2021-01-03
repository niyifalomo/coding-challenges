package com.codingchallenges.easy;

import com.codingchallenges.common.ListNode;

public class ReverseSinglyLinkedList {
    public static ListNode reverseListIteratively(ListNode head) {

        /*
            Time = O(n), Space = O(1)
         */

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }


    public static ListNode reverseListRecursively(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode reversedListNodeHead = reverseListRecursively(head.next);
        head.next.next = head;
        head.next = null;

        return reversedListNodeHead;
    }

    /*
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

     */
}
