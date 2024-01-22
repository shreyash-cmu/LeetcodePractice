class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> set = new HashSet<>();
        int maxCount =0;
        for(int num:nums)
            set.add(num);
        for(int num:nums){
            int left =num-1;
            int right=num+1;
            int count =1;
            while(set.remove(left)){
                left--;
                count++;
            }
            while(set.remove(right)){
                right++;
                count++;
            }
            maxCount = Math.max(maxCount,count);
        }
        return maxCount;
    }
}