class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int ans =0;
        for(int num: nums){
            ans += Math.abs(num - nums[len/2]);
        }
        return ans;
    }
}