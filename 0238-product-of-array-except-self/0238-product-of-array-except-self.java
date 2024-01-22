class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = 1;
        int l = 1;
        int r =1;
        right[nums.length-1] =1;
        for(int i=1;i<nums.length;i++){
            left[i] = nums[i-1] * l;
            l = l * nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            right[i] = nums[i+1] * r;
            r = r * nums[i+1];
        }
        int ret[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ret[i] = left[i] * right[i];
        }
        return ret;
    }
}