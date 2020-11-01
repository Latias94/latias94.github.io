/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prehead = new ListNode(0), fast = head, slow = prehead;
        slow.next = fast;
        while (fast != null) {
            while (fast.next != null && fast.val == fast.next.val) {
                fast = fast.next;
            }
            // 之前发现同样的元素
            if (slow.next != fast) {
                slow.next = fast.next;
                fast = slow.next;
            } else {
                // 之前没发现同样的元素
                slow = slow.next;
                fast = fast.next;
            }
        }
        return prehead.next;
    }
}