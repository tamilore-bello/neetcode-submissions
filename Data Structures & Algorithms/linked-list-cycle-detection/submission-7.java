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
    public boolean hasCycle(ListNode head) {
         HashSet<ListNode> set = new HashSet<>();
         while (head != null) {
            if (set.contains(head)) { System.out.println(head.val+"in head"); return true;}
            System.out.println(set.contains(head));
            set.add(head);
            head = head.next;
         }
         return false;
    }
}

// hashmap of all visited locations. if a current head location in the map return false. 
// otherwise, when head = null, return true;
