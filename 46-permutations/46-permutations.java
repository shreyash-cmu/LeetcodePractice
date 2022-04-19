class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        helper(nums,new ArrayList<Integer>(), ret);
        return ret;
    }
    void helper(int[] nums, List<Integer> levels, List<List<Integer>> ret){
        if(levels.size()== nums.length){
            ret.add(new ArrayList<Integer>(levels));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(levels.contains(nums[i]))continue;
            levels.add(nums[i]);
            helper(nums,levels,ret);
            levels.remove(levels.size()-1);
        }
    }
}