/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
        public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode head1 = head;
        ListNode head2 = partition(head);
        head1 = sortList(head1);
        head2 = sortList(head2);
        return mergeSort(head1, head2);
    }

    public ListNode mergeSort(ListNode node1, ListNode node2) {
        ListNode head = new ListNode(-1);
        ListNode tail = head;
        while (node1 != null && node2 != null) {
            if (node1.val <= node2.val) {
                tail.next = node1;
                node1 = node1.next;
            } else {
                tail.next = node2;
                node2 = node2.next;
            }
            tail = tail.next;
            tail.next = null;
        }
        // node1 还没迭代完
        if (node1 != null) {
            tail.next = node1;
        }
        if (node2 != null) {
            tail.next = node2;
        }
        return head.next;
    }

    // 切分
    public ListNode partition(ListNode node) {
        ListNode fast = node.next;
        ListNode slow = node.next;
        ListNode header = node;
        
        while (true) {
            if (fast != null) fast = fast.next;
            else break;
            if (fast != null) fast = fast.next;
            else break;
            header = slow;
            slow = slow.next;
        }
        // 切分
        header.next = null;
        return slow;
    }
}