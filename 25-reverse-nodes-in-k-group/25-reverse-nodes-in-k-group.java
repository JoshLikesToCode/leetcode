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
        if(head == null || k <= 1)
            return head;
        ListNode curr = head;
        ListNode prev = null;
        int size = 0;
        while(curr != null)
        {
            curr = curr.next;
            size++;
        }
        curr = head;
        while(size >= k)
        {
            ListNode prevList = prev;
            ListNode currList = curr;
            for(int i = 0; curr != null && i < k; i++)
            {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            if(prevList != null)
                prevList.next = prev;
            else
                head = prev;
            currList.next = curr;
            size -= k;
            prev = currList;
        }
        return head;
    }
}