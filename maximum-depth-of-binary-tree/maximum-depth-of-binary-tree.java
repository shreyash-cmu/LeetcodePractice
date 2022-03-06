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
    int maxDepth =0;
    public int maxDepth(TreeNode root) {
        helper(root, 1);
        return maxDepth;
    }
    void helper(TreeNode node, int depth){
        if(node== null) return;
        if(node.left==null && node.right==null){
            maxDepth = Math.max(maxDepth, depth);
        }
        helper(node.left,depth+1);
        helper(node.right,depth+1);
        
    }
}