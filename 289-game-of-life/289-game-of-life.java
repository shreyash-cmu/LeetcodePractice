class Solution {
    public void gameOfLife(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        int[][] grid = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                int nei = countNeighbours(i,j,board,rows,cols);
                if(board[i][j]==0){
                    if(nei==3) grid[i][j]=1;
                }else{
                    if(nei>=2 && nei <=3) grid[i][j]=1;
                }
            }
        }
        System.arraycopy(grid,0,board,0, grid.length);
    }
    
    public int countNeighbours(int r, int c,int[][] mat, int row,int col){
        int ans=0;
        for(int i = r-1;i<=r+1;i++){
            for(int j= c-1;j<=c+1;j++){
                  if(i<0||j<0||i>=row||j>=col||(i==r &&j==c)|| mat[i][j]==0) continue;
                ans++;
            }
        }
        return ans;
    }
}