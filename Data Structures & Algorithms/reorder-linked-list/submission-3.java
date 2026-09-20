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
    public void reorderList(ListNode head) {
        ListNode middle = head;
        ListNode end = head;

        // locate middle and end
        while (end.next != null && end.next.next != null) { 
            end = end.next.next;
            middle = middle.next;
        }
        ListNode truemiddle = middle;
        middle = middle.next;
        truemiddle.next = null;

        ListNode prev = null;
        ListNode next_ = null;
        // reorder middle to end.
        while (middle != null) {
            next_ = middle.next;
            middle.next = prev;
            prev = middle;
            middle = next_;
        }
        
        int i = 0;
        // prev is now the middle
        // alternate reorder.
        while (prev != null) {
            ListNode remainderS = head.next;
            ListNode remainderM = prev.next;
            head.next = prev;
            prev.next = remainderS;
            prev = remainderM;
            head = head.next.next;
        }
        
    }
}

// label each node with a position, then 
// re-insert based on their labeled positions.