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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // run time: traverse entire tree of p and q, O(2n)
        // Big O Notation: O(N)
        // case 1: if both roots are null, return true
        // case 2: if one of them are null, return false
        // case 3: two valid roots, but not same values, return false
        // check if left subtree of p and q are eqal && right subtree of p and q are equal
        
        if(p == null && q == null) {
            return true;
        } else if(p == null || q == null) {
            return false;   
        } else if(p.val != q.val) {
            return false;
        } else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}