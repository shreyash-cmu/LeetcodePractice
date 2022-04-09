class Solution {
    /*
    
    Brute force:
        At each index see the number of bs to the left of it, and number of as to the right
        these are the number of deletions
        global minDeletion variable keeps getting updated with minDeletion
    
    
    */
    public int minimumDeletions(String s) {
        int countB =0;
        int[] dp = new int[s.length()+1];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                countB++;
                dp[i+1] = dp[i];
            }else{
                dp[i+1] = Math.min(dp[i]+1, countB);
            }
        }
        return dp[s.length()];
    }
    List<Integer> countA(String word, int idx){
        int countB =0;
        int countA = 0;
        for(int i =0;i<idx;i++){
            if(word.charAt(i)=='b') countB++;
        }
        for(int i= idx+1;i<word.length();i++){
            if(word.charAt(i)=='a') countA++;
        }
        return Arrays.asList(countA,countB);
    }
}