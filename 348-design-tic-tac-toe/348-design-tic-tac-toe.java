class TicTacToe {
    int[][] board;
    int[] Arows;
    int[] Acols;
    int[] Brows;
    int[] Bcols;
    int ArightD;
    int AleftD;
    int BrightD;
    int BleftD;
    int size;
    public TicTacToe(int n) {
        board= new int[n][n];
        Arows = new int[n];
        Acols = new int[n];
        Brows = new int[n];
        Bcols = new int[n];
        size =n;
    }
    
    public int move(int row, int col, int player) {
        if(player%2==0){
            Brows[row]++;
            Bcols[col]++;
            if((row+col) == size-1){
                BleftD++;
            }
            if(row==col){
                BrightD++;
            }
            if(Brows[row]==size || Bcols[col]==size|| BleftD==size||BrightD==size){
                return player;
            }
        }else{
            Arows[row]++;
            Acols[col]++;
            if((row+col) == size-1){
                AleftD++;
            }
           if(row==col){
                ArightD++;
            }
            if(Arows[row]==size || Acols[col]==size||AleftD==size || ArightD==size){
                return player;
            }
        }
        return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */