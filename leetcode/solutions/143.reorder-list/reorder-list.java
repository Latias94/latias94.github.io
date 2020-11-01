/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        Map<Integer, ListNode> map = new HashMap<Integer, ListNode>();
        ListNode helper = head;
        int index = 0;
        while (helper != null) {
            map.put(index, helper);
            helper = helper.next;
            index++;
        }

        int length = index - 1;
        index = 0;

        while (length - index >= (length + 1) / 2) {
            if (length - index == (length + 1) / 2) {
                map.get(length - index).next = null;
                break;
            }
            map.get(index).next = map.get(length - index);
            map.get(length - index).next = map.get(++index);
        }
    }
}