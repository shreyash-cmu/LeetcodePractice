class Solution {
    public String tictactoe(int[][] moves) {
        int[] rowA = new int[3];
        int[] rowB = new int[3];
        int[] colA = new int[3];
        int[] colB = new int[3];
        int D1a =0, D2a=0, D1b =0, D2b =0;
        for(int i=0;i<moves.length;i++){
            int x = moves[i][0];
            int y = moves[i][1];
            if(i%2!=0){
                if(++rowB[x]==3 || ++colB[y]==3 || (x==y && ++D1b==3) ||(x+y==2 && ++D2b==3) ){
                    return "B";
                }
            }else{
                
                if(++rowA[x]==3 || ++colA[y]==3 || (x==y && ++D1a==3) ||(x+y==2 && ++D2a==3) ){
                    return "A";
                }
            }
        }
        return moves.length==9?"Draw":"Pending";
    }
}