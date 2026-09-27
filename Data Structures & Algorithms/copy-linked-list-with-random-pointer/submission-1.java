/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null ) return null;
        Node trueHead = head;

        while (head != null) {
            Node copy = new Node(head.val); 
            copy.next = head.next;
            head.next = copy;
            head = head.next.next;
        }   

        head = trueHead;
        Node copyHead = trueHead.next;
        // [3][3']  [7][7']  [4][4']  [5][5']
        while (head != null) {
            Node copy = head.next;
            Node next = head.next.next;
            if (head.random != null) 
                copy.random = head.random.next;
            head = next;
        }

        head = trueHead;
        
        while (head != null) {
            Node copy = head.next;
            head.next = copy.next;
            head = head.next;
            copy.next = (head != null) ? head.next : null;
        }

    return copyHead;

    }
}

// deep copy: 
// recreate new nodes with all the values of the other nodes.

/**

1. for each HEAD, recrate it. if the HEAD random isn't in set, create it as well.
     else, if the HEAD random is in memory, set that to next. 
2. next head.

the other solution (ideal) is add a' after every a, etc. so when iterating from head again, both random and next are formed from a' or random'. 

**/

// lwk gpt couldnt solve it nor could i properly but a hash set implementation i would be able to do ....