class Solution {
    public boolean isPalindrome(int x) {
        if(x==0)return true;
        int num =x;
        int n=0;
        while(num>0){
            n = n*10 + num%10;
            num = num/10;
        }
        //System.out.println(n);
        if(x==n) return true;
        return false;
    }
}