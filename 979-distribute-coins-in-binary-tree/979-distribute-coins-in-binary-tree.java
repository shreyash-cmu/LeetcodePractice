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
    int moves =0;
    public int distributeCoins(TreeNode root) {
        /*
            Go to each leaf node, and take one coin if you have more than one
            and return the remaining to the parent and number of jumps.
            If the child is 0, then move that money and subtract 1 from parent.
            Increase the move count.
        */
        helper(root);
        return moves;
    }
    public int helper(TreeNode current){
        if(current==null) return 0;
        int left = helper(current.left);
        int right = helper(current.right);
        moves += Math.abs(left) + Math.abs(right);
        return left + right + current.val -1;
        
        
    }
    
    
}