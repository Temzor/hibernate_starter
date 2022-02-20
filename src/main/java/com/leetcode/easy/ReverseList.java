package com.leetcode.easy;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode preview = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = preview;
            preview = head;
            head = next;
        }
        return preview;
    }
}
