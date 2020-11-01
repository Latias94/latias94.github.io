/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;

        ListNode walker = head;
        ListNode runner = head;
        ListNode helper = head;
        while (runner.next != null && runner.next.next != null) {
            walker = walker.next;
            runner = runner.next.next;
            if(walker == runner){
                while (helper != walker){
                    helper = helper.next;
                    walker = walker.next;
                }
                return walker;
            }
        }
        return null;
    }
}