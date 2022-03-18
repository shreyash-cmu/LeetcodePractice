class Solution {
    public String decodeString(String s) {
        /*
            Store the index of openeing bracket in the stack.
            On closing bracket, get the string between opening and closing;
            multiply it by opening -1 index number. 
            
            
            Iterate froim start to end
            if you get a digit; find the corresponding number;
            now find the opening and closing bracket of that number
            pass this substring and number to the helper
            the helper returns the string
            add this string to stringBuilder
            
            
            Inside help[er], start adding items into the stringBuilder
            If we encounter aborther bracket, call helper with substring and freq
            
            
       */
        return helper(0, s.length()-1, s);
    }
   
    
    
    String helper(int startIdx, int endIdx, String s){
        
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int freq = 0;
        for(int i=startIdx;i<=endIdx;i++){
            Character c = s.charAt(i);
            if(Character.isDigit(c)){
                freq = freq*10 + (c-'0');
            }
            else if(c == '['){
                int startIndex = i+1;
                stack.push(i);
                while(stack.size()!=0){
                    i++;
                    if(s.charAt(i) == '['){
                        stack.push(i);
                    }else if(s.charAt(i)==']'){
                        stack.pop();
                    }
                }
                int endIndex = i -1 ;
                String ans = helper(startIndex, endIndex, s);
               for(int j=0; j<freq; j++) sb.append(ans);
                freq =0;
            }else{
                sb.append(c);
            }
            
        }
        return sb.toString();
       
    }
    
}