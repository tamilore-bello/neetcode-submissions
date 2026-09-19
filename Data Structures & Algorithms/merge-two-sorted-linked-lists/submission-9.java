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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode other;
        ListNode ref;
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val < list2.val) {
            ref = list1;
            other = list2;
        } else {
            ref = list2;
            other = list1;
        }
        ListNode head = ref;

        while (ref.next != null) {
            if (other.val <= ref.next.val) {
                ListNode nextOther = other.next;
                ListNode remainder = ref.next;
                ref.next = other;
                other.next = remainder;
                ref = other;
                other = nextOther;
            } else {
                ref = ref.next;
            }
            if (other == null) return head;
        }
        if (ref.next == null && other != null) ref.next = other;
        return head;
    }
}

// 19:00 new strat
// if list1 <=, it's the ref. else, ref = list2. 
    // this ref is list1. other is other.

// if ref == null, ref.next = other. return.
// if they're equal, other = other++ & ref ++ 
// if ref < other, 
    // nextOther = other.next;
    // remainder = ref.next
    // ref.next = other;
    // other.next = remainder.
        // ref = ref.next
        // other = nextOther
// if ref < other, ref++
// if other = null, return.


