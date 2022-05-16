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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode curr = head;
        int size = 0;
        while(curr != null)
        {
            curr = curr.next;
            size++;
        }
        curr = head;
        ListNode prev = null;
        int count = 1;
        while(size > 0)
        {
            count = Math.min(count, size);
            size -= count;
            if(count % 2 != 0)
            {
                for(int j = 0; curr != null && j < count; j++)
                {
                    prev = curr;
                    curr = curr.next;
                }
            }
            else
            {
                ListNode prevList = prev;
                ListNode currList = curr;
                for(int j = 0; curr != null && j < count; j++)
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
                prev = currList;
            }
            count++;
        }
        return head;
    }
}