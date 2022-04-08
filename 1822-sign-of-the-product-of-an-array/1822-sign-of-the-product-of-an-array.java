class Solution {
    public int arraySign(int[] nums) {
        int nsign = 0;
        for(int num:nums){
            if(num==0) return 0;
            if(num<0) nsign++;
        }
        if(nsign%2==0) return 1;
        return -1;
    }
}