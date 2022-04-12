class Solution {
    int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
    public int orangesRotting(int[][] grid) {
        /*
        At each minute, we do bfs on every rotten orange
        we keep a count of beforeFresh and afterFresh;
        if before and after are equal then return -1;
        
        
        
        */
        int rows = grid.length;
        int cols = grid[0].length;
        int minute = 0;
        int counter =2;
        int newCounter = -1;
        while(true){
            int beforeFresh = countFreshOranges(grid,rows,cols);
            if(beforeFresh==0) return minute;
            minute++;
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    if(grid[i][j]==counter){
                        rotten(i,j,grid,newCounter);
                    }
                }
            }
            counter = newCounter;
            newCounter -=1;
            int afterFresh = countFreshOranges(grid,rows,cols);
            //System.out.println(Arrays.deepToString(grid));
            if(beforeFresh == afterFresh) return -1;
        }
    }
    void rotten(int r, int c, int[][] grid, int counter){
        for(int[] d: dir){
            int rr = r + d[0];
            int cc = c + d[1];
            if(rr>=0 && cc>=0 && rr<grid.length && cc<grid[0].length && grid[rr][cc]==1){
                grid[rr][cc]=counter;
            }
        }
    }
    int countFreshOranges(int[][] grid, int rows, int cols) {
        int cnt =0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1) cnt++;
            }
        }
        return cnt;
    }
}