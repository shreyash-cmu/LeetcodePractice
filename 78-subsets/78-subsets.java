class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        helper(nums, new ArrayList<>(),ret,0);
        return ret;
    }
    void helper(int[] nums, List<Integer> levels,List<List<Integer>> results, int start){
        results.add(new ArrayList<>(levels));
        for(int i =start;i<nums.length;i++){
            levels.add(nums[i]);
            helper(nums, levels, results,i+1);
            levels.remove(levels.size()-1);
        }
    }
}