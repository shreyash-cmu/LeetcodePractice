class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> letters = new ArrayList<>();
        List<String> digits = new ArrayList<>();
        for(String log:logs){
            if(Character.isDigit( log.charAt(log.indexOf(" ")+1))){
                digits.add(log);
            }else{
                letters.add(log);
            }
        }
        letters.sort((a,b)->{
            int diff = a.substring(a.indexOf(" ")).compareTo(b.substring(b.indexOf(" ")));
            if(diff==0) return a.compareTo(b);
            return diff;
        });
        for(int i=0;i<digits.size();i++){
            letters.add(digits.get(i));
        }
        return letters.toArray(new String[letters.size()]);
    }
}