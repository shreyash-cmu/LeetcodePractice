class Solution {
    public int[][] generateMatrix(int n) {
        int left =0;
        int right = n-1;
        int movingcounter =1;
        
        int[][] grid = new int[n][n];
        while(left<right){
            int diff = right-left;
            int top = left;
            int bottom = right;
            for(int i=0;i<(right-left);i++){
                grid[top][left+i] = movingcounter;
                grid[top+i][right] =grid[top][left+i] + diff;
                grid[bottom][right-i] =grid[top+i][right] + diff;
                grid[bottom-i][left] =grid[bottom][right-i] + diff;
                movingcounter++;
            }
            left++;
            right--;
            movingcounter += diff*3;
        }
        if(n%2!=0){
            grid[n/2][n/2]= n*n;
        }
        return grid;
    }
}