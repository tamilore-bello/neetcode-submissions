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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1.val == 0 && l2.val == 0) return new ListNode(0);

        int carry = 0;
        ListNode head = new ListNode(0);
        ListNode result = head;

        while (l1 != null || l2 != null) {
            int i = 0;
            int j = 0;

            if (l1 != null) i = l1.val;
            if (l2 != null) j = l2.val;

            if (i + j + carry > 9) {
                head.next = new ListNode((i + j + carry)%10);
                carry = 1;
            } else {
                head.next = new ListNode(i + j + carry);
                carry = 0;
            }
            head = head.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }    
        
        if (carry != 0) head.next = new ListNode(carry);
        return result.next;
    }
}

// build strings from node values, cast to ints, and return answers. 
// we can even skip the sting lwk 

// 1 + 20 + 300
// 4 + 50 + 600
// sum : 579
// then: 579 % 10 = 9. 579/10 = 57
// 57 % 10 = 7. 57/10 = 5
// 5 % 10 = 5. 5/10 = 0;
// 5 + 70 + 900

// easy soluton in under 10

