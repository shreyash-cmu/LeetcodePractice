class Solution {
    public int kthFactor(int n, int k) {
        if(k==1) return 1;
        int counter =1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                if(++counter == k){
                    return i;
                }
            }
        }
        if(++counter == k){
            return n;
        }
        return -1;
    }
}