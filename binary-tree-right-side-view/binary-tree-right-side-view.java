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
    public List<Integer> rightSideView(TreeNode root) {
        // can use bfs and return last element for each level
        // whenever it says top-to-bottom, clear indication that bfs can be used
        
        // run time: O(n) elements as traversing through entire tree and n is number of nodes in tree
        // add all elements to list, so space complexity worst case is O(n)
        List<Integer> result = new ArrayList<>();
        
        if(root == null) {
            return result;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        // process the entire tree
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                // iterate through all values
                TreeNode current = queue.remove();
                
                // check for last thing in loop, means last element in current level
                if(i == size - 1) {
                    result.add(current.val);
                }
                
                // do we have other things to process, any children
                if(current.left != null) {
                    queue.add(current.left);
                }
                
                if(current.right != null) {
                    queue.add(current.right);
                } 
            }
        }
        
        return result;
        
        
    }
}