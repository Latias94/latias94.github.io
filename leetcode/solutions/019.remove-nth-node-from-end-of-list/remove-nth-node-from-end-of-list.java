/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode zeroHead = new ListNode(0);
        zeroHead.next = head;
        ListNode front = zeroHead;
        ListNode last = zeroHead;

        for (int i = 0; i < n+1; i++) {
            last = last.next;
        }

        while (last!=null){
            front = front.next;
            last = last.next;
        }
        front.next = front.next.next;
        return zeroHead.next;
    }
}