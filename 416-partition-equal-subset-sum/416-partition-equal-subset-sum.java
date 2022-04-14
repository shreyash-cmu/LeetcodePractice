class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num: nums){
            sum+= num;
        }
        if(sum%2==1) return false;
        
        Set<Integer> set = new HashSet<>();
        set.add(0);
        for(int num:nums){
            Set<Integer> levelSet = new HashSet<>();
            for(int n:set){
                levelSet.add(n);
                levelSet.add(n+num);
            }
            set = new HashSet<Integer>(levelSet);
        }
        return set.contains(sum/2);
    }
}