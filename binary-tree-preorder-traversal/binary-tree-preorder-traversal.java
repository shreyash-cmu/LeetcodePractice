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
    ArrayList<Integer> nodes = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        
        preOrder(root,nodes);
        return nodes;
    }
    void preOrder(TreeNode node, ArrayList<Integer> nodes){
        if(node==null){
            return;
        }
        nodes.add(node.val);
        preOrder(node.left, nodes);
        preOrder(node.right, nodes);
    }
}