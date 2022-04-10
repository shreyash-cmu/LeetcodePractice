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
    int goodNode =0;
    public int goodNodes(TreeNode root) {
        helper(root, Integer.MIN_VALUE);
        return goodNode;
    }
    void helper(TreeNode node, int maxValue){
        if(node==null)return;
        if(node.val>=maxValue)goodNode++;
        helper(node.left, Math.max(node.val, maxValue));
        helper(node.right, Math.max(node.val, maxValue));
    }
}