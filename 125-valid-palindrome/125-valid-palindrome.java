class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isAlphabetic(c)|| Character.isDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        String original = sb.toString();
        //System.out.println("OG "+original);
        //System.out.println(sb.reverse().toString());
        return original.equals(sb.reverse().toString());
    }
}