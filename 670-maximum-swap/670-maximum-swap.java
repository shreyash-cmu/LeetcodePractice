class Solution {
    public int maximumSwap(int num) {
        int temp =num;
        List<Integer> list = new ArrayList<>();
        while(num>0){
            list.add(num%10);
            num = num/10;
        }
        Collections.reverse(list);
        int n = list.size();
        int maxElement = Integer.MIN_VALUE;
        int toBeSwapped = -1;
        int swapper = -1;
        int currMaxIndex = -1;
        for(int i = n-1; i>=0;i--){
            if(list.get(i)< maxElement){
                toBeSwapped = i;
                swapper = currMaxIndex;
            }
            else if(list.get(i)==maxElement)continue;
            else{
                maxElement = list.get(i);
                currMaxIndex = i;
            }
        }
        if(swapper == -1){
            return temp;
        }
        int i = list.get(toBeSwapped);
        list.set(toBeSwapped, list.get(swapper));
        list.set(swapper, i);
        for(int j =0; j<n;j++){
            num = num *10 + list.get(j);
        }
        return num;
    }
}