class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        boolean found1= false;
        boolean found2= false;
        int lastAidx=-1, lastBidx=-1;
        int dist= Integer.MAX_VALUE;
        for(int i=0;i<wordsDict.length;i++){
            if(wordsDict[i].equals(word1)){
                found1=true;
                lastAidx=i;
                if(found2){
                    dist = Math.min(dist,Math.abs(lastBidx-i));
                }
            }
            if(wordsDict[i].equals(word2)){
                found2=true;
                lastBidx=i;
                if(found1){
                    dist = Math.min(dist,Math.abs(lastAidx-i));
                }
            }
        }
        return dist;
    }
}