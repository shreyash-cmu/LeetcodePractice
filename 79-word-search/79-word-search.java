class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(board, word, i,j,0)) return true;
            }
        }
        return false;
    }
    public boolean dfs(char[][] board, String word, int i,int j, int idx){
        if(word.length()==idx){
            return true;
        }
        if(i<0 || i>=board.length|| j<0 || j>=board[0].length){
            return false;
        }
        if(board[i][j] == word.charAt(idx)){
            char temp = board[i][j];
            board[i][j]='0';
            boolean exists = dfs(board,word,i+1,j,idx+1)||
            dfs(board,word,i-1,j,idx+1)||
            dfs(board,word,i,j-1,idx+1)||
            dfs(board,word,i,j+1,idx+1);
            board[i][j]=temp;
            return exists;
        }else{
            return false;
        }
        
            
        
    }
}