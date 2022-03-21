class Solution {
    int[][] moves = {{1, 2}, {1, -2}, {2, 1}, {2, -1}, {-1, 2}, {-1, -2}, {-2, 1}, {-2, -1}};
    public double knightProbability(int N, int K, int r, int c) {
        
        double[][] dp = new double[N][N];
        dp[r][c]=1;
        while(K-->0){
            double[][] dp2 = new double[N][N];
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    for(int[] move: moves){
                        //System.out.println(move[0]);
                        int r1 = i + move[0];
                        int c1 = j + move[1];
                        //System.out.println(move[0]+", "+move[1] + "  "+"("+r1+", "+c1+")"+i+j);
                        if(isValid(r1,c1,N)){
                            dp2[r1][c1] += dp[i][j] / 8.0;
                        }
                    }
                }   
            }
            //System.out.println(K);
            //System.out.println(Arrays.deepToString(dp2));
            dp = dp2;
        }
        double sum =0.0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                sum += dp[i][j];
            }
        }
        return sum;
    }
    
    
    public static boolean isValid(int i, int j, int n){
        if(i>=0 && i<n && j>=0 && j<n) return true;
        return false;
    }
}
