class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*
            Sweep over the array twice:
            1. left to right: product of numvber upto n-1 index
            2. right to left: multiply the rightptr to the number
            Output[0] =1
            
        */
        int n = nums.length;
        int[] output = new int[n];
        output[0]=1;
        for(int i=1;i<n;i++){
            output[i] = output[i-1] * nums[i-1];
        }
        int rightSum =1;
        for(int i=n-1;i>=0;i--){
            output[i]= output[i] * rightSum;
            rightSum = rightSum * nums[i];
        }
        return output;
        
    }
}