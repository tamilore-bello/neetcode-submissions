/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        if (root.val == subRoot.val) { 
            if (isSubRoot(root, subRoot)) return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean isSubRoot(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) return true;
        else if (root == null) return false;
        else if (subRoot == null) return false;
        else if (root.val == subRoot.val) return isSubRoot(root.left, subRoot.left) && isSubRoot(root.right, subRoot.right);
        else return false;
    }
}

// flow: 
// 1 - check if it could be root. if so, recursively check subtree.
// if it passes above, return true. else, iterate down.