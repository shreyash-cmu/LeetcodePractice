class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num: nums){
            sum+= num;
        }
        if(sum%2==1) return false;
        int target = sum/2;
        Set<Integer> set = new HashSet<>();
        set.add(0);
        for(int num:nums){
            Set<Integer> levelSet = new HashSet<>();
            for(int n:set){
                levelSet.add(n);
                levelSet.add(n+num);
                if(levelSet.contains(target)){
                    return true;
                }
            }
            set = new HashSet<Integer>(levelSet);
        }
        return set.contains(target);
    }
}