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
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        //List<TreeNode> leaves = new ArrayList<>();
        List<Integer> left = new ArrayList<>();
        //List<TreeNode> right = new ArrayList<>();
        left.add(root.val);
        if(root.left==null && root.right==null){
            return left;
        }
        /*Queue<TreeNode> q = new Queue<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode = curr = q.poll();
            
            
            
            if(curr.left== null && curr.right== null){
                leaves.add(curr);
            }
            
            
        }*/
        
        helperleft(root.left, left);
        //System.out.println(left);
        helperleaves(root,left);
        helperRight(root.right,left);
        return left;
        
    }
    
    
    void helperleft(TreeNode node, List<Integer> boundary){
        if(node==null) return;
        if(node.left==null && node.right==null) return;
        boundary.add(node.val);
        if(node.left==null && node.right!=null){
            helperleft(node.right, boundary);
        } 
        
        helperleft(node.left,boundary);
        
    }
     void helperRight(TreeNode node, List<Integer> boundary){
        if(node==null) return;
        if(node.right==null && node.left==null) return;
        if(node.right==null && node.left!=null){
            helperRight(node.left, boundary);
        } 
        helperRight(node.right,boundary);
        boundary.add(node.val);
    }
    void helperleaves(TreeNode node, List<Integer> leaves){
        if(node==null) return;
        if(node.left==null && node.right==null) leaves.add(node.val);
        helperleaves(node.left,leaves);
        helperleaves(node.right,leaves);
    }
}