class Solution {
    Set<List<Integer>> ret = new HashSet<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTrack(candidates,0,target, new ArrayList<Integer>());
        return new ArrayList<>(ret);
    }
    void backTrack(int[] nums,int idx, int target, List<Integer> levels){
        if(target<0) return;
        if(target==0){
            ret.add(new ArrayList<>(levels));
            return;
        }
        for(int i = idx;i<nums.length;i++){
            levels.add(nums[i]);
            backTrack(nums,i,target-nums[i], levels);
            levels.remove(levels.size()-1);
        }
    }
}