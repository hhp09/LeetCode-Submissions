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
    
    public boolean isPalindrome(ListNode head) {
        /*
        // extra space of O(n)
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        
        while(curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        
        int a = 0;
        int b = list.size() - 1;
        
        while(a < b) {
            if(list.get(a) != list.get(b)) {
                return false;
            }
            a++;
            b--;
        }
        
        return true;  
        */
        
        // find middle of list
        // reverse second half of list
        // iterate pointers node-after-node and compare values
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // we need left half to be bigger than right
        if(fast != null) {
            slow = slow.next;
        }
        
        slow = reverse(slow);
        fast = head;
        
        while(slow != null) {
            if(fast.val != slow.val) {
                return false;
            }
            
            slow = slow.next;
            fast = fast.next;
        }
        
        return true;
    }
    
    public ListNode reverse(ListNode head) {
            ListNode next = null;
            ListNode prev = null;
            ListNode curr = head;
            
            while(curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            
            head = curr;
            return prev;
        }
}