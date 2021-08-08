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
    public List<List<Integer>> levelOrder(TreeNode root) {
        /*
        Intuition behind solution: Create a queue and add the root to the queue. While the queue is not empty process all the nodes in the queue. At every iteration of the queue not being empty, get the size of the queue (this represents however many nodes are on the current level of the tree). Iterate through all these nodes with a for loop, adding their values to a "current level" list. After adding their value to the list, check if they have left and right children adding them to the queue is they do exist (this allows us to process the next level of the tree on the next iteration of our while loop). Once our for loop terminates we have populated a list of all the nodes' values on the current level and we add this list to our return value (a list of lists). Once our while loop ends we have processed all the levels of the true and therefore return our result (our list of lists).
        */
        
        // level by level traversal
        List<List<Integer>> result = new ArrayList<>();
        
        // base case
        if(root == null) {
            return result;
        }
        
        // using queue: FIFO data structure
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()) {
            //get size of queue, how many different nodes in the current level to process
            int size = queue.size();
            
            // for every single level, list of all nodes values
            List<Integer> currentLevel = new ArrayList<>();
            
            // iterate through all the things in the queue
            for(int i = 0; i < size; i++) {
                // Get the current node that we need to process
                TreeNode current = queue.remove();
                
                // Add its value to the currentLevel list
                currentLevel.add(current.val);
                
                // Now, look at the current node and see if it has a left or right child, if so, add it to the queue
                if(current.left != null) {
                    queue.add(current.left);
                }
                
                if(current.right != null) {
                    queue.add(current.right);
                }
            }
            
            // now add list to list of lists
            result.add(currentLevel);
        }
        
        return result;
        
    }
}