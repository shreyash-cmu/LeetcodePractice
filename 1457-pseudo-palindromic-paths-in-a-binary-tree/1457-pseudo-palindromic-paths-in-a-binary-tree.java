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
    int result =0;
    public int pseudoPalindromicPaths (TreeNode root) {
        checkPalindrome(root, new int[10]);
        return result;
    }
    public void checkPalindrome(TreeNode root, int[] freq){
        if(root==null){
            return;
        }
        freq[root.val] += 1;
        if(root.left==null && root.right==null){
            if(isItTrue(freq)){
                result+=1;
            }
        }
        
        
        checkPalindrome(root.left,freq);
        checkPalindrome(root.right,freq);
        
        freq[root.val] -=1;
    }
    boolean isItTrue(int[] map){
        int miss = 0;
        for(int i=0;i<=9;i++){
            if(map[i] % 2 != 0)
                miss++;
            if(miss > 1)
                return false;
        }
        return true;
    }
    
    
}