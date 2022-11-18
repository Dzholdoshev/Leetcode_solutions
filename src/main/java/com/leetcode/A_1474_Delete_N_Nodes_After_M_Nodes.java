package com.leetcode;




public class A_1474_Delete_N_Nodes_After_M_Nodes {

    public static Node deleteNodes(Node head, int m, int n) {
        Node currentNode = head;
        Node lastMNode = head;
        while (currentNode != null) {
            int mCount = m, nCount = n;
            while (currentNode != null && mCount != 0) {
                lastMNode = currentNode;
                currentNode = currentNode.next;
                mCount--;
            } while (currentNode != null && nCount != 0) {
                currentNode = currentNode.next;
                nCount--;
            }
            lastMNode.next = currentNode;
        } return head;
    }

}
class Node {
    int val;
    Node next;

    Node() {
    }

    Node(int val) {
        this.val = val;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}