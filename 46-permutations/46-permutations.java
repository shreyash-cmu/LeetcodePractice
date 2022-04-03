class Solution {
    List<List<Integer>> ret = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        helper(nums, new ArrayList<>());
        return ret;
    }
    void helper(int[] nums, List<Integer> levelList){
        
        if(levelList.size() == nums.length){
            ret.add(new ArrayList<>(levelList));
            return;
        }
        for(int i = 0;i<nums.length;i++){
            if(levelList.contains(nums[i]))continue;
            levelList.add(nums[i]);
            helper(nums,levelList);
            levelList.remove(levelList.size()-1);
        }
    }
}