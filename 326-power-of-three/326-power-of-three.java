class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1)return true;
        double pow3 = 3;
        int pow =2;
        while(pow3<=n){
            
            if(pow3== (double)n){
                return true;
            } 
            pow3 = Math.pow(3,pow++);
        }
        
        return false;
    }
}