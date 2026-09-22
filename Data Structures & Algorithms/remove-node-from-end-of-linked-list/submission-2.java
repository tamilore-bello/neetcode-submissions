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
        n = n - 1;
        ListNode dummy = new ListNode(); dummy.next = head;
        ListNode later = dummy;
        ListNode future = head;

        for (int i = 0; i < n; i++) 
            future = future.next;
        
         System.out.println(later.val + " " + future.val);
        
        while (future.next != null) { 
            future = future.next;
            later = later.next;
        }

        //if (later.next == future) later.next = null;
        later.next = later.next.next;
        return dummy.next;
    }
}

// keep one node n + 1 from the other. 
// when n is null, read the other pointer, use that to perform the excision

// [1,2,3,4]
// 