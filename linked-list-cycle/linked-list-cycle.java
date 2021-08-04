/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        /*
        // use hash table to put nodes in hashset, if present, then return true
        // this is using extra memory
        Set<ListNode> set = new HashSet<>();
        
        while(head != null) {
            if(set.contains(head)) {
                return true;
            }
            
            set.add(head);
            head = head.next;
        }
        
        return false;
        */
        
        // two pointer, fast and slow pointer approach that does not use extra memory
        ListNode p = head;
        ListNode q = head;
        
        while(q != null && q.next != null) {
            q = q.next.next;
            p = p.next;
            
            if(p == q) {
                return true;
            }
        }
        
        return false;
    }
}