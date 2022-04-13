class Solution {
    public String strWithout3a3b(int a, int b) {
        /*
        use all the excess and when count for a and b matches then add them pairwise.
        while(great>smaller){
        sb.add(greater);
        }
        */
        
        int len = a+b;
        int countA =0;
        int counterA =0;
        int counterB =0;
        int countB =0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<len;i++){
            if((a>=b) && (countA<2 &&a>0) || (countB==2 && a>0)){
                sb.append('a');
                countA++;
                counterA++;
                countB=0;
                a--;
            }
            if((b>=a)&&(countB<2&&b>0) || (countA==2&&b>0)){
                sb.append('b');
                countB++;
                counterB++;
                countA=0;
                b--;
            }
        }
        return sb.toString();
    }
}