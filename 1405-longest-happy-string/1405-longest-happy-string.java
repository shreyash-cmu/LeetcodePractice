class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sb = new StringBuilder();
        int currA =0;
        int currB =0;
        int currC =0;
        
        int stringSize = a + b+c;
        for(int i =0; i<stringSize;i++){
            if((a>=b && a>=c && currA<2)|| (currB==2 && a>0) || (currC==2&& a>0)){
                sb.append('a');
                currA +=1;
                a--;
                currB=0;
                currC=0;
            }else if((b>=a && b>=c && currB<2)|| (currA==2 && b>0) || (currC==2&& b>0)){
                sb.append('b');
                currB +=1;
                b--;
                currA=0;
                currC=0;
            }else if((c>=a && c>=b && currC<2)|| (currA==2 && c>0) || (currB==2&& c>0)){
                sb.append('c');
                currC +=1;
                c--;
                currA=0;
                currB=0;
            } 
        }
        return sb.toString();
    }
}