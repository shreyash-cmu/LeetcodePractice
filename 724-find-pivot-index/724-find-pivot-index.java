class Solution {
    public int pivotIndex(int[] nums) {
        /*
            [1,2,4,5]
            3,  5
        */
        
        int sum = 0;
        for(int num:nums){
            sum+= num;
        }
        int leftSum = 0;
        for(int i = 0; i<nums.length;i++){
            sum -= nums[i];
            if(leftSum == sum) return i;
            leftSum += nums[i];
            
        }
        return -1;
    }
}