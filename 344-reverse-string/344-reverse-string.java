class Solution {
    public void reverseString(char[] s) {
        int start =0;
        int end =s.length-1;
        while(start<=end){
            swap(start,end,s);
            start++;
            end--;
        }
        
        
    }
    void swap(int i, int j, char[] s){
        char temp = s[i];
        s[i]=s[j];
        s[j]=temp;
    }
}