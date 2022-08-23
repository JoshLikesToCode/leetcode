/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public bool IsPalindrome(ListNode head) {
        List<int> list = new List<int>();
        ListNode curr = head;
        while(curr != null)
        {
            list.Add(curr.val);
            curr = curr.next;
        }
        int a = 0;
        int b = list.Count() - 1;
        while(a < b)
        {
            if(list[a++] != list[b--])
                return false;
        }
        return true;
    }
}