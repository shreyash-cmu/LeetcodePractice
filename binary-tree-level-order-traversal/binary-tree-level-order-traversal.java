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
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        helper(root, 0, map);
        List<List<Integer>> answer = new ArrayList<>();
        for(List<Integer> list : map.values()){
            answer.add(list);
        }
        return answer;
    }
    void helper(TreeNode node, int level, HashMap<Integer,List<Integer>> map){
        if(node==null){
            return;
        }
        map.putIfAbsent(level, new ArrayList<Integer>());
        map.get(level).add(node.val);
        helper(node.left, level+1, map);
        helper(node.right, level+1, map);
    }
}