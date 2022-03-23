class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] freq = new int[26];
        for(char c: sentence.toCharArray()){
            if(Character.isAlphabetic(c)){
                freq[c-'a']++;
            }
        }
        for(int num:freq){
            if(num==0) return false;
        }
        return true;
    }
}