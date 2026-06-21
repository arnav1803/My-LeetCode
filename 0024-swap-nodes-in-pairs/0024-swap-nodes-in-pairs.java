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
    public ListNode swapPairs(ListNode head) {
        ListNode temp=head;
        if(head==null || head.next==null){
            return head;
        }
        ListNode odd= new ListNode(-1);
        ListNode even= new ListNode(-1);

        ListNode temp1=odd;
        ListNode temp2=even;
        
        int pos=0;

        while(temp!=null){
            if(pos%2==0){
                temp2.next=temp;
                temp2=temp2.next;
            }else{
                temp1.next=temp;
                temp1=temp1.next;
            }
            temp=temp.next;
            pos++;
        }
        temp1.next = null;
        temp2.next = null;

        ListNode ans= new ListNode(-1);
        temp=ans;

        temp1=odd.next;
        temp2=even.next;

        while(temp1!=null && temp2!=null){
            temp.next=temp1;
            temp=temp.next;
            temp1=temp1.next;

            temp.next= temp2;
            temp=temp.next;
            temp2=temp2.next;

            if(temp1!=null){
                temp.next=temp1;
            }else temp.next=temp2;
        }

        return ans.next;
    }
}