class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        /*
            If [2,5]:
            Count the number of 2's in firstRow and secondRow
            firstRow: 3
            SecondRow: 2
            
            
            Intial tops = tops[0];
            intial bottoms = bottoms[0];
            swappedTop = bottoms[0]
            SwappedBottom = tops[0]
            for i from 1 to n
                if(tops[i]!=initalTop || tops[i]!=bottom)
                if intialtops != tops[i] && initialTops == bottoms[i]:
                    initialTopSwaps++;
                if intialBottom != bottom[i] && initialBottom==tops[i]:
                    initialBottomSwaps++;
                if swappedBottom != bottom[i] && swappedBottom==top[i]:
                    swappedBottomSwaps++;
                if swappedTop != top[i] && swappedTop==bottom[i]:
                    swappedTopSwaps++;
            
            
        */
        
        int[] validNos = new int[]{tops[0],bottoms[0]};
        //int min =Integer.MIN_VALUE;
        for(int j=0;j<2;j++){
            int topsCnt =0;
            int bottomsCnt =0;
            int i=1;
            for(i=0;i<tops.length;i++){
                if(validNos[j]!= tops[i] && validNos[j]!= bottoms[i]){
                    break;
                }
                if(tops[i] == validNos[j]){
                    topsCnt++;
                }
                if(bottoms[i] ==validNos[j]){
                    bottomsCnt++;
                }
            }
            if(i==tops.length){
                return tops.length - Math.max(topsCnt, bottomsCnt);
            }
        }
       return -1;
    }
}