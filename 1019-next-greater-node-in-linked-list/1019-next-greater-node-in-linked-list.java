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
    public int[] nextLargerNodes(ListNode head) {
        int size = 0;
        ListNode curr = head;
        while(curr != null)
        {
            size++;
            curr = curr.next;
        }
        int[] res = new int[size];
        int idx = 0;
        curr = head;
        while(curr != null)
        {
            ListNode nxt = curr.next;
            int currVal = curr.val;
            boolean found = false;
            while(nxt != null)
            {
                if(nxt.val > curr.val)
                {
                    res[idx++] = nxt.val;
                    found = true;
                    break;
                }
                nxt = nxt.next;
            }
            if(!found)
                res[idx++] = 0;
            found = false;
            curr = curr.next;
        }
        return res;
    }
}