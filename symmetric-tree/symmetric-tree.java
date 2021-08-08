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
    public boolean isSymmetric(TreeNode root) {
        // similar to inverting a binary tree, just check if values are equal or not
        // run time: O(n)
        // case to check if it is null
        if(root == null) {
            return true;
        }
        
        // compare left subtree and right subtree
        // note: polymorphism (overloading, with different arguments)
        return isSymmetric(root.left, root.right);
    }
    
    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if(left == null || right == null) {
            return left == right;
        }
        
        if(left.val != right.val) {
            return false;
        }
        // values of left subtree are same as right subtree
        
        // we have checked our base cases
        // now we need recursive calls
        // check subtrees of roots we have now
        // first check: check left subtrees left subtree, compare that with right subtrees right subtree
        // second check: left subtrees right child == right subtrees left child
        // inner subtrees and outer subtree must match
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}