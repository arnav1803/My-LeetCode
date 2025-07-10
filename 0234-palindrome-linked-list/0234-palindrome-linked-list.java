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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
    int count=0;
    while(temp!=null) {
        count++;
        temp=temp.next;
    }

    int mid=count/2;
    temp=head;
    for (int i=0;i<mid;i++) {
        temp=temp.next;
    }
    ListNode temp1=null;
    ListNode temp2=null;
    while (temp!=null) {
        temp2=temp.next;
        temp.next=temp1;
        temp1=temp;
        temp=temp2;
    }
    temp=head;
    while (temp1!=null) {
        if (temp.val!=temp1.val) {
            return false;
        }
        temp=temp.next;
        temp1=temp1.next;
    }

    return true;
    }
}