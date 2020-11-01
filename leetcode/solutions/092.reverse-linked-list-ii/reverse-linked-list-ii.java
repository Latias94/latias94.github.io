/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        int count = 0;
        ListNode helper = head;
        Stack<ListNode> stack = new Stack<>();
        ListNode prehead = new ListNode(-1);
        ListNode helper1 = prehead;
        while (helper != null) {
            count++;
            if (count < m) {
                prehead.next = new ListNode(helper.val);
                prehead = prehead.next;
                helper = helper.next;
            } else if (m <= count && count <= n) {
                stack.push(helper);
                helper = helper.next;
            } else {
                break;
            }
        }

        while (!stack.isEmpty()) {
            prehead.next = new ListNode(stack.pop().val);
            prehead = prehead.next;
        }

        while (helper != null) {
            prehead.next = new ListNode(helper.val);
            helper = helper.next;
            prehead = prehead.next;
        }

        return helper1.next;
    }
}