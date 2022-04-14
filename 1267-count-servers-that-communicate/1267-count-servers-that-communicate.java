class Solution {
    int[][] dir = {{-1,0},{0,1},{0,-1},{1,0}};
    public int countServers(int[][] grid) {
        int connected =0;
        int rows = grid.length;
        int cols = grid[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                
                if(grid[i][j]==1){
                    connected += helper(i,j,grid,rows,cols);
                }
            }
        }
        return connected;
    }
    int helper(int i, int j, int[][] grid, int rows, int cols){
        int rowConnected =0;
        int colConnected =0;
        for(int k=0;k<cols;k++){
            if(grid[i][k]==1)rowConnected++;
            if(rowConnected==2)return 1;
        }
        for(int k=0;k<rows;k++){
            if(grid[k][j]==1)colConnected++;
            if(colConnected==2)return 1;
        }
        return 0;
    }
}