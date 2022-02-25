class Solution {
    int maxLen,start;
    public String longestPalindrome(String s) {
        if(s.length()==1) return s;
        int max = 1;
        for(int i=0; i< s.length();i++){
            checkWindow(s, i,i);
            checkWindow(s, i,i+1);
            
        }
        return s.substring(start, start+maxLen);
    }
    public void checkWindow(String s, int i, int j){
        while(i>= 0 && j< s.length() && s.charAt(i)== s.charAt(j)){
            j++;
            i--;
        }
        if(j-i-1>maxLen){
            start = i+1;
            maxLen = j-i-1;
        }
    }
}