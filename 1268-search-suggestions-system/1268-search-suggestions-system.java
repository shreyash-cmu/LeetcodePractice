class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> ret = new ArrayList();
        Arrays.sort(products);
        //Arrays.stream(products).forEach(System.out::println);
        //int counter =0;        
        for( int i=0;i<searchWord.length();i++){
            ArrayList<String> level = suggested(searchWord.substring(0,i+1), products);
            ret.add(level);
        }
        return ret;
    }
    private static ArrayList<String> suggested(String word, String[] suggestedResults){
        if(suggestedResults.length == 0) return new ArrayList<String>();
        ArrayList<String> levels = new ArrayList();
        int counter =0;
        for(String s : suggestedResults){
            if(s.startsWith(word) && counter <3){
                levels.add(s);
                counter++;
            }
        }
        return levels;
    }
}