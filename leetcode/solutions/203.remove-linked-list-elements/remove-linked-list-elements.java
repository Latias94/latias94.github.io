/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode helper = new ListNode(-1);
        helper.next = head;
        ListNode list = helper;

        while (helper.next != null) {
            if (helper.next.val == val) {
                helper.next = helper.next.next;
            } else {
                helper = helper.next;
            }
        }
        return list.next;
    }
}