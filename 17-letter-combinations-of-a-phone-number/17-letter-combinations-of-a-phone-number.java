class Solution {
    private Map<Character, String> combo = Map.of(
        '2', "abc", '3', "def", '4', "ghi", '5', "jkl", 
        '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return new ArrayList<>();
        List<String> results = new ArrayList<>();
        backTrack(digits, 0, new StringBuilder(), results);
        return results;
    }
     
    void backTrack(String digits, int index, StringBuilder sb, List<String> results){
        if(sb.length()== digits.length()){
            results.add(sb.toString());
            return;
        }
        String values = combo.get(digits.charAt(index));
        for(char c: values.toCharArray()){
            sb.append(c);
            backTrack(digits,index+1,sb,results);
            sb.deleteCharAt(sb.length() -1);
        }
    }
}