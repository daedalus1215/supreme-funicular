package org.example.linkedLists;

public class AddTwoNumbers {
    public static ListNode addTwoNumbersLinkedList() {
        ListNode node = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode node2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
        int count = 0;

        final ListNode head = new ListNode(0);
        ListNode l3 = head, p1 = node, p2 = node2;

        while (p1 != null || p2 != null) {
            if (p1 != null) {
                count += p1.val;
                p1 = p1.next;
            }
            if (p2 != null) {
                count += p2.val;
                p2 = p2.next;
            }
            l3.next = new ListNode(count % 10);
            l3 = l3.next;
            count /= 10;
        }
        if (count == 1) {
            l3.next = new ListNode(1);
        }
        return head.next;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}