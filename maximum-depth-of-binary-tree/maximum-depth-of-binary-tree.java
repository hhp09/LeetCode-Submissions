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
    public int maxDepth(TreeNode root) {
        // recursively check levels until you reach max
        // run time: O(N), exploring or traversing the entire tree
        // base case: leaf node's child which is null at depth 0
        // if not at base case, explore left and right child and check what depth they are at
        // eventually get to base case, and go back and track depth + 1
        
        // base case:
        if(root == null) {
            return 0;
        }
        
        // what level am I at
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}