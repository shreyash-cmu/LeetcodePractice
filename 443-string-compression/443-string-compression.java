class Solution {
    public int compress(char[] chars) {
        int idx =0;
        
        for(int i = 0;i<chars.length;i++){
            int count =1;
            char currentChar = chars[i];
            while(i+1 < chars.length && chars[i] == chars[i+1] ){
                i++;
                count++;
            }
            if(count>1){
                String s = "" + count;
                StringBuilder sb = new StringBuilder(Integer.valueOf(count));
                chars[idx++] = currentChar;
                for(char c: s.toCharArray()){
                    chars[idx++] = c;
                }
            }else{
                chars[idx++] = currentChar;
            }
        }
        return idx;
    }
}