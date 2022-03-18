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
    public List<List<Integer>> verticalOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        Map<Integer, List<Integer>> map = new TreeMap();
        q1.add(root);
        q2.add(0);
        while(!q1.isEmpty()){
            TreeNode curr = q1.remove();
            int col = q2.remove();
            min = Math.min(min,col);
            max = Math.max(max, col);
            map.putIfAbsent(col, new ArrayList<Integer>());
            map.get(col).add(curr.val);
            if(curr.left!=null){
                q1.add(curr.left);
                q2.add(col-1);
            }
            if(curr.right!=null){
                q1.add(curr.right);
                q2.add(col+1);
            }
        }
        List<List<Integer>> answer = new ArrayList<>();
        for(int i=min;i<=max;i++){
            answer.add(map.get(i));
        }
        return answer;
    }
}