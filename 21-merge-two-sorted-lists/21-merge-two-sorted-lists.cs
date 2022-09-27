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
    public ListNode MergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        if(list1 == null && list2 == null)
            return null;
        ListNode currA = list1;
        ListNode currB = list2;
        ListNode res = new ListNode();
        ListNode dummy = res;
        while(currA != null && currB != null)
        {
            if(currA.val <= currB.val)
            {
                res.val = currA.val;
                res.next = new ListNode();
                res = res.next;
                currA = currA.next;
            }
            else
            {
                res.val = currB.val;
                res.next = new ListNode();
                res = res.next;
                currB = currB.next;
            }
        }
        while(currA != null)
        {
            res.val = currA.val;
            if(currA.next != null)
            {
                res.next = new ListNode();
                res = res.next;
            }
            currA = currA.next;
        }
        while(currB != null)
        {
            res.val = currB.val;
            if(currB.next != null)
            {
                res.next = new ListNode();
                res = res.next;
            }
                currB = currB.next;
        }
        return dummy;
    }
}