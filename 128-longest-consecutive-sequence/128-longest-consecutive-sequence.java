class Solution {
    public int longestConsecutive(int[] nums) {
        /*
            Sort the array and check for the gaps.
            if the gap is 
        
        */
        if(nums.length==0) return 0;
        int runningLength =1;
        int maxLength =1;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]-1 == nums[i-1]){
                runningLength++;
            }else if (nums[i-1]==nums[i])
            {
                continue;
            }
            else{
                runningLength = 1;
            }
            maxLength = Math.max(maxLength, runningLength);
        }
        return maxLength;
    }
}