/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode helper = new ListNode(0);
        helper.next = head;
        ListNode largeList = new ListNode(0);
        ListNode smallList = new ListNode(0);
        ListNode list = smallList;
        ListNode large = largeList;
        while (helper.next != null) {
            if (helper.next.val < x) {
                smallList.next = helper.next;
                helper.next = helper.next.next;
                smallList = smallList.next;
                smallList.next = null;
            } else {
                largeList.next = helper.next;
                helper.next = helper.next.next;
                largeList = largeList.next;
                largeList.next = null;
            }
        }
        smallList.next = large.next;
        return list.next;
    }
}