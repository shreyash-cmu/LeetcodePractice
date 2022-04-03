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
    int maxDepth = 0;
    public int maxDepth(TreeNode root) {
        if(root==null) return maxDepth;
        helper(root,1);
        return maxDepth;
    }
    void helper(TreeNode node, int level){
        if(node==null) return;
        maxDepth = Math.max(maxDepth, level);
        helper(node.left,level+1);
        helper(node.right,level+1);
    }
}