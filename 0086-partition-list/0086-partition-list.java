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
    public ListNode partition(ListNode head, int x) {

        ListNode small = new ListNode(-1);
        ListNode large = new ListNode(-1);

        ListNode temp1= small;
        ListNode temp2= large;

        ListNode temp=head;
        
        while(temp!=null){
            if(temp.val<x) {
                temp1.next=temp;
                temp1=temp1.next;
            }else{
                temp2.next=temp;
                temp2=temp2.next;
            }
            temp=temp.next;
        }
        temp1.next=large.next;
        temp2.next=null;

        return small.next;

    }
}