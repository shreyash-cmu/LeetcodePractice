/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
Iterate over the list.
If it contains a child node, call the helper function and the function
will return a linked list which will return the child linked list
With two pointers, namely head and tail.
Then make the connections and check for edge cases.


*/

class Solution {
    public Node flatten(Node head) {
        Node temp = head;
        while(temp!= null){
            if(temp.child!=null){
                List<Node> connections = helper(temp.child);
                
                Node next = temp.next;
                if(next!=null){
                    connections.get(1).next = next;
                    next.prev = connections.get(1);
                }
                temp.next = connections.get(0);
                connections.get(0).prev = temp;
                
                temp.child = null;
            }
            temp = temp.next;
        }
        return head;
    }
    public List<Node> helper(Node child){
        if(child== null)
            return null;
        Node start = child;
        Node end = child;
        while(end.next!=null){
            end = end.next;
        }
        return Arrays.asList(start,end);
    }
}