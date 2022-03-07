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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next !=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Stack<Integer> stack = new Stack<>();
        if(slow.next!=null) slow = slow.next;
        while(slow!=null){
            stack.push(slow.val);
            slow = slow.next;
        }
        ListNode temp = head;
        while(temp!=null){
            if(!stack.isEmpty() && stack.pop() != temp.val) return false;
            temp = temp.next;
        }
        return true;
    }
}