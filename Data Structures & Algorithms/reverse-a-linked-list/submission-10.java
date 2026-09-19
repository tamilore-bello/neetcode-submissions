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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prior = null;
        while (head.next != null) {
            ListNode next = head.next;
            head.next = prior;
            prior = head;
            head = next;
        }
        head.next = prior;
        return head;
    }
}


