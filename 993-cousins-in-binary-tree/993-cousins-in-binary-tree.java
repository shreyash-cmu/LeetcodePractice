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
    List<Integer> levels = new ArrayList<>();
    List<TreeNode> parents = new ArrayList<>();
    public boolean isCousins(TreeNode root, int x, int y) {
        helper(root,x, 0,null);
        helper(root,y,0,null);
        if(parents.get(0)== parents.get(1)){
            return false;
        }
        
        return levels.get(0) == levels.get(1);
    }
    public void helper(TreeNode node, int target, int level,TreeNode parent){
        if(node==null){
            return;
        }
        //System.out.println(node.val);
        if(node.val == target){
            parents.add(parent);
            levels.add(level);
        }
        helper(node.left, target, level+1,node);
        helper(node.right, target, level+1,node);
    }
}