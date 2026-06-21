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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode start=head;
        while(start!=null &&start.next!=null){
            ListNode temp1=start;
            ListNode temp2=start;
            while(temp1.next!=null && temp1.val==temp1.next.val){
                temp1=temp1.next;
            }
            temp2.next=temp1.next;
            start=temp2.next;
        }
        return head;
    }
}