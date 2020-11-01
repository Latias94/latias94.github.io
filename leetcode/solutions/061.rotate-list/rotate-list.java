/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode prehead = new ListNode(-1);
        prehead.next = head;
        ListNode front = prehead;
        ListNode end = prehead;
        int length;
        for (length = 0; end.next != null; length++) {
            end = end.next;
        }
        if (length == 0) return null;
        k = k % length;
        
        if (head.next == null || k <= 0) return head;
        for (int i = 0; i < k - 1; i++) {
            if (head.next != null) {
                head = head.next;
            } else {
                return null;
            }
        }

        if (head.next == null) {
            return prehead.next;
        }

        while (head.next != null) {
            head = head.next;
            front = front.next;
        }

        head.next = prehead.next;
        prehead.next = front.next;
        front.next = null;

        return prehead.next;
    }
}