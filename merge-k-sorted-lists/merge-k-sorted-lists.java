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
    public ListNode mergeKLists(ListNode[] lists) {
        // throw every node into a min heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // iterate through every linked list inside lists
        for(ListNode head: lists) {
            while(head != null) {   // add value of head to minHeap, and change head to head.next
                minHeap.add(head.val);
                head = head.next;
            }
        }
        
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        
        while(!minHeap.isEmpty()) {
            head.next = new ListNode(minHeap.remove());
            head = head.next;
        }
        
        return dummy.next;
    }
}