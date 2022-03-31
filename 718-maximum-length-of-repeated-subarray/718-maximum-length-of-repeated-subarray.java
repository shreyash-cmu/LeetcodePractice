class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int max = Integer.MIN_VALUE;
        int[][] dp = new int[nums1.length+1][nums2.length+1];
        for(int i=0;i<=nums1.length;i++){
            for(int j=0;j<=nums2.length;j++){
                if(i==0||j==0) dp[i][j]=0;
                else if(nums1[i-1]==nums2[j-1]){
                    dp[i][j] = dp[i-1][j-1] +1;
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        return max==Integer.MIN_VALUE?0:max;
    }
}