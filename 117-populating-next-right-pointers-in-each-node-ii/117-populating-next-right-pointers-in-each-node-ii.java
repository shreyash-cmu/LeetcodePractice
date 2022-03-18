/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
/*
    Collect all same level nodes into a queue.
    Collect its childerned into a child queue.
    Process the parent queue to make the right connections.
    Once the parent is processed, process the child queue.
*/

class Solution {
    public Node connect(Node root) {
        if(root == null) return root;
        Queue<Node> q1 = new LinkedList<Node>();
        Queue<Node> q2 = new LinkedList<Node>();
        q1.add(root);
        while(!q1.isEmpty()){
            while(q1.size() !=0){
                Node curr = q1.poll();
                curr.next = q1.peek();
                if(curr.left != null){
                    q2.add(curr.left);
                }
                if(curr.right != null){
                    q2.add(curr.right);
                }
                //curr = curr.next;
            }
            q1 = q2;
            q2 = new LinkedList<Node>();
        }
        return root;
    }
}