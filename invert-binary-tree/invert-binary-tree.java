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
    public TreeNode invertTree(TreeNode root) {
        // swapping leaves of sub tree in binary tree
        // Run Time Complexity: O(n)
        // Space complexity: O(n)
        if(root == null) {
            return root;
        }
        
        // traverse down left and right sides of tree
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        
        // swapping
        root.right = left;
        root.left = right;
        
        return root;
    }
}
