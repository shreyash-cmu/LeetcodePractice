class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int wordIndex =0;
        int abbrIndex =0;
        while(abbrIndex < abbr.length() && wordIndex < word.length()){
            char w = word.charAt(wordIndex);
            char a = abbr.charAt(abbrIndex);
            
            if(a == w ){
                wordIndex++;
                abbrIndex++;
                continue;
            }
            if(a == '0'){
                return false;
            }
            if(!Character.isDigit(a)){
                return false;
            }
            int runningAbbr = getabbrIndexlength(abbrIndex, abbr);
            abbrIndex += String.valueOf(runningAbbr).length();
            wordIndex += runningAbbr;
        }
        
        return (wordIndex == word.length()) && (abbrIndex == abbr.length()); 
        
    }
    
    public int getabbrIndexlength(int index, String abbr){
        StringBuilder sb = new StringBuilder();
        for(int i=index;i<abbr.length();i++){
            if(Character.isDigit(abbr.charAt(i))){
                sb.append(abbr.charAt(i));
            }
            else{
                break;
            }
        }
        return Integer.parseInt(sb.toString());
    }
    
    
}