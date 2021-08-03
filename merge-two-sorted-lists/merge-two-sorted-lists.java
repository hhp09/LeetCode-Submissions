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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode preHead = new ListNode(0);
        ListNode curr = preHead;
        
        while(l1 != null && l2 != null) {
            if(l1.val > l2.val) {
                curr.next = l2;
                l2 = l2.next;
            } else {
                curr.next = l1;
                l1 = l1.next;
            }
            
            // while loop incrementer
            curr = curr.next;
        }
        
        if(l1 == null) {
            curr.next = l2;
        } else {
            curr.next = l1;
        }
        
        return preHead.next;
    }
}