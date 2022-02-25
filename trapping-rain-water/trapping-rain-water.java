class Solution {
    public int trap(int[] height) {
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];
        maxLeft[0] = 0;
        int leftPtr= height[0];
        for (int i=1;i<height.length;i++){
            leftPtr = Math.max(leftPtr, height[i]);
            maxLeft[i] = leftPtr;
        }
        
        
        
        maxRight[height.length-1] = 0;
        int rightPtr = height[height.length-1];
        for (int i=height.length-2;i>=0;i--){
            rightPtr = Math.max(rightPtr, height[i]);
            maxRight[i] = rightPtr;
        }
        
        
        int water=0;
        for(int i=0;i<height.length;i++){
            int diff = Math.min(maxLeft[i], maxRight[i]) - height[i];
            if(diff>0){
                water += diff;
            } 
        }
        return water;
    }
}