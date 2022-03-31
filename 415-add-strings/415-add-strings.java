class Solution {
    public String addStrings(String num1, String num2) {
        int ptr1 = num1.length()-1;
        int ptr2 = num2.length()-1;
        int carry = 0;
        StringBuilder sum = new StringBuilder();
        while(ptr1>=0 || ptr2>=0){
            int posA = 0;
            int posB = 0;
            if(ptr1>=0){
                posA = num1.charAt(ptr1)-'0';
            }
            if(ptr2>=0){
                posB = num2.charAt(ptr2)-'0';
            }
            int sum2 = posA + posB + carry;
            carry = sum2/10;
            sum.append(sum2%10);
            ptr1--;
            ptr2--;
        }
        if(carry!=0){
            sum.append(carry);
        }
        
        return sum.reverse().toString();   
    }
}