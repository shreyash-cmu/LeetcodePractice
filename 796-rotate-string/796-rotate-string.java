class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)) return true;
        int shift = 1;
        int len = s.length();
        while(shift<len){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<len;i++){
                sb.append(s.charAt((len+ i+ shift)%len));
            }
            if(sb.toString().equals(goal)){
                return true;
            }
            shift++;
        }
        return false;
    }
}