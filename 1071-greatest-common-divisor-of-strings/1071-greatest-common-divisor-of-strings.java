class Solution {
    /*
        Str1: XVVVVVVBC
        Str2: ABC
        
        str2 will always be the smaller string;
        
        Str1: 
        A:
    
    
    */
    public String gcdOfStrings(String str1, String str2) {
        if(str2.length()> str1.length()){
            return gcdOfStrings(str2,str1);
        }
        
        for(int i=str2.length()-1;i>=0;i--){
            String check = str2.substring(0,i+1);
            String[] arr = str1.split(check);
            String[] arr2 = str2.split(check);
            
            if(arr.length==0 && arr2.length==0){
                return check;
            }
            
        }
        return "";
        
    //     for(int i=0;i<str2.length();i++){
    //         if(str1.length() % (i+1)!=0){
    //             continue;
    //         }
    //         String newStr = constructString(str2.substring(0,i+1), str1.length());
    //         if(newStr.equals(str1)){
    //            if( ( str2.length()%(i+1) )==0) ans= str2.substring(0,i+1);
    //         }
    //     }
    //     return ans;
    // }
    // public String constructString(String a, int len){
    //     //System.out.println(a);
    //     StringBuilder sb = new StringBuilder();
    //     int currLength =0;
    //     while(currLength<len){
    //         sb.append(a);
    //         currLength += a.length(); 
    //     }
    //     return sb.toString();
    } 
}