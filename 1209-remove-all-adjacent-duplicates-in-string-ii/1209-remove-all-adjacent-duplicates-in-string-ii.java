class Solution {
    public String removeDuplicates(String s, int k) {
        /*
            frequency count of characters
            if frequency>k, push freq - k into the queue
            
        */
        Stack<Pair<Character,Integer>> stack = new Stack();
        Pair<Character,Integer> charFreq = new Pair<>(s.charAt(0),1);
        stack.push(charFreq);
        for(int i=1;i<s.length();i++){
            if(!stack.isEmpty() && s.charAt(i) == stack.peek().getKey()){
                Pair<Character,Integer> curr = stack.pop();
                if(!(curr.getValue()+1 == k)){
                    //curr.setValue(curr.getValue()+1);
                    stack.push(new Pair<>(curr.getKey(), curr.getValue()+1));
                }
            }
            else{
                stack.push(new Pair<>(s.charAt(i),1));
                //Pair<Character,Integer> charFreq = new Pair(s.charAt(i),1);
            }
            
        }
        StringBuilder sb = new StringBuilder();
        var i = stack.iterator();
        while(i.hasNext()){
            int count =0;
            Pair<Character,Integer> curr = i.next();
            while(++count<= curr.getValue()){
                sb.append(curr.getKey());
            }
        }
       return sb.toString(); 
    }
}