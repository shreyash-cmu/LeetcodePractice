/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node inorderSuccessor(Node node) {
        if(node.right != null){
            return helper(node.right);
        }
        else{
            Node parent = node.parent;
            while(parent!=null){
                if(node == parent.left){
                    return parent;
                }else{
                    node = parent;
                    parent = parent.parent;
                }
            }
        }
        return null;
    }
    Node helper(Node node){
        if(node.left==null) return node;
        return helper(node.left);
    }
}