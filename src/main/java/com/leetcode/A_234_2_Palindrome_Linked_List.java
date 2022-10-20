package com.leetcode;

public class A_234_2_Palindrome_Linked_List {
    public boolean isPalindrome(com.leetcode.ListNode head) {

        ListNode slow = head, fast = head, prev, nextNode, current;
        // find middle point
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // reverse 2nd half of linked list
        prev = slow;
        current = slow.next;
        prev.next = null;
        // we break the reverse cycle and avoid an endless loop.
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        // palindrome check : first half and second half
        ListNode left = head;
        ListNode right = prev;
        while (left != null && right != null) {
            if (left.val != right.val) return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }
}






