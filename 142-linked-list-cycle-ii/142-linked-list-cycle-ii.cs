/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode DetectCycle(ListNode head) {
        if(head == null)
            return null;
        HashSet<ListNode> hs = new HashSet<ListNode>();
        while(head != null)
        {
            if(hs.Contains(head))
                return head;
            else
                hs.Add(head);
            head = head.next;
        }
        return null;
    }
}