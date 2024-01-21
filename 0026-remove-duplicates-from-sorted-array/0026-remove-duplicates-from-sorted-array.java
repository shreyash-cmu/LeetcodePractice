class Solution {
    public int removeDuplicates(int[] nums) {
        //Iterate over the array
        //if prev element is current element
        //
        int uniqueIndex =0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[uniqueIndex])
                nums[++uniqueIndex] = nums[i];
        }
        return ++uniqueIndex;
    }
}