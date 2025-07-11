class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        if (k > count) return head;
        ListNode temp1 = head, prev1 = null;
        for (int i = 1; i < k; i++) {
            prev1 = temp1;
            temp1 = temp1.next;
        }
        ListNode temp2 = head, prev2 = null;
        for (int i = 1; i < count - k + 1; i++) {
            prev2 = temp2;
            temp2 = temp2.next;
        }
        if (prev1 != null) prev1.next = temp2;
        else head = temp2;
        if (prev2 != null) prev2.next = temp1;
        else head = temp1;
        ListNode nxt = temp1.next;
        temp1.next = temp2.next;
        temp2.next = nxt;
        return head;
    }
}
