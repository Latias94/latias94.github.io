/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean shift = false;
        int sum = l1.val + l2.val;

        if (sum / 10 > 0){
            shift = true;
            sum -= 10;
        }
        ListNode result = new ListNode(sum);
        ListNode replace = result;
        l1 = l1.next;
        l2 = l2.next;
        while (l1 != null || l2 != null) {
            sum = 0;
            if (shift) {
                sum += 1;
                shift = false;
            }
            
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            if (sum / 10 > 0) {
                shift = true;
                sum -= 10;
            }

            replace.next = new ListNode(sum);
            replace = replace.next;

        }

        if(shift){
            replace.next = new ListNode(1);
        }
        
        return result;
    }
}