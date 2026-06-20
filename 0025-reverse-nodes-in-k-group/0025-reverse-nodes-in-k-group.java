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
    public ListNode reverseKGroup(ListNode head, int k) {
        		ListNode start = head;
		while (start != null) {
			Stack<Integer> st = new Stack<>();
			int count = 0;
			ListNode temp1 = start;
			
			while (count<k && temp1 != null) {
				count++;
				temp1 = temp1.next;
			}
            if(count<k) break;
			
			temp1 = start;
			int nodes=count;
			count = 0;
			while (count<nodes) {
				st.push(temp1.val);
				temp1 = temp1.next;
				count++;
			}
			temp1 = start;
			
			while (count>0) {
				temp1.val = st.pop();
				temp1 = temp1.next;
				count--;
			}
			start = temp1;
			
		}
		return head;
    }
}