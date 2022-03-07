class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int runningSum = sum;
        for(int i=1;i<nums.length;i++){
            runningSum = Math.max(nums[i]+runningSum, nums[i]);
            sum = Math.max(sum, runningSum);
        }
        return sum;
    }
}