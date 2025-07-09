/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode t1 = null;         // previous
        ListNode t2 = head;         // current
        ListNode t3 = null;         // next

        while (t2 != null) {
            t3 = t2.next;           // store next
            t2.next = t1;           // reverse pointer
            t1 = t2;                // move prev forward
            t2 = t3;                // move current forward
        }

        return t1; // new head
    }
}
