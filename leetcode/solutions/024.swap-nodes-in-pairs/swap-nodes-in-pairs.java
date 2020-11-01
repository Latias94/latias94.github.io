/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null) return null;
        if(head.next==null) return head;
        ListNode temp;
        ListNode zeroHead = new ListNode(0);
        ListNode front = zeroHead;
        zeroHead.next = head;
        while (front.next.next != null) {
            temp = front.next;
            front.next = temp.next;
            if(front.next.next!=null){
                temp.next = front.next.next;
                front.next.next = temp;
                front = front.next.next;
            } else {
                temp.next = null;
                front.next.next = temp;
                front = front.next;
            }
        }
        return zeroHead.next;
    }
}