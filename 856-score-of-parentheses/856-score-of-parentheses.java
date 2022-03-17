class Solution {
    public int scoreOfParentheses(String s) {
        /*
            Push  into stack until you see the first closing bracket;
            On getting a closing bracket:
                multiply by 2 each time you pop of the stack
            once stack is empty; add it to result
            
        
        
        */
        int result =0;
        Stack<Integer> stack = new Stack();
        for(Character c: s.toCharArray()){
            if(c == '('){
                stack.push(result);
                result =0;
            }
            else{
                result = stack.pop() + Math.max(2*result,1);
            }
        }
        return result;
    }
}