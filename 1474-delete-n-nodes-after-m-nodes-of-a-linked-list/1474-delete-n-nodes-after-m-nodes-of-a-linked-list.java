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
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode curr = head;
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
        while(curr != null)
        {
            for(int i = 0; i < m && curr != null; i++)
            {
                ListNode node = new ListNode(curr.val);
                dummy.next = node;
                curr = curr.next;
                dummy = dummy.next;
            }
            
            for(int i = 0; i < n && curr != null; i++)
                curr = curr.next;
        }
        return res.next;
    }
}