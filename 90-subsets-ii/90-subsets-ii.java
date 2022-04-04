class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        helper(nums, set, new ArrayList<>(), 0);
        return new ArrayList<>(set);
    }
    void helper(int[] nums, Set<List<Integer>> set, ArrayList<Integer> levels, int start){
        set.add(new ArrayList<>(levels));
        for(int i=start;i<nums.length;i++){
            levels.add(nums[i]);
            helper(nums, set, levels, i+1);
            levels.remove(levels.size()-1);
        }
    }
}