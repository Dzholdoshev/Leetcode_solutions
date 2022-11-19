package com.leetcode;

import java.util.HashSet;

public class A_142_Linked_List_Cycle_II {

    static ListNode detectCycleWithTwoPointer(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                ListNode firstNode = head;
                ListNode intersection = fast;
                while (firstNode != intersection) {
                    intersection = intersection.next;
                    firstNode = firstNode.next;
                }
                return firstNode;
            }
        }
        return null;
    }

    static ListNode withHashSet(ListNode head) {
        if (head == null) return null;
        ListNode current = head;
        HashSet<ListNode> set = new HashSet<>();
        while (current != null) {
            if (!set.add(current)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

}
