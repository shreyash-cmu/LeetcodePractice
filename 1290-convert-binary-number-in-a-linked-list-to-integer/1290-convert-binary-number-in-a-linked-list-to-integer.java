/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode runner = head;
        while(runner.next!=null){
            stack.push(runner.val);
            runner = runner.next;
        }
        //System.out.println(num);
        int num = runner.val;
        int pow = 1;
        while(!stack.isEmpty()){
            num += Math.pow(stack.pop()*2,pow++);
        }
        return num;
    }
}