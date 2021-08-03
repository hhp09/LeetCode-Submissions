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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // two pointer approach
        // to delete a specific node, simply assign the next node's value to the specific node, and the specific node should point to next.next
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        // slow and fast should have a difference of n as they traverse
        while(fast.next != null) {
            fast = fast.next;
            if(n-- <= 0) {          // decrement n as fast proceeds, and slow will start moving once n difference has been established between two pointers
                slow = slow.next;
            }
        }
        
        slow.next = slow.next.next;
        return dummy.next;
    }
}