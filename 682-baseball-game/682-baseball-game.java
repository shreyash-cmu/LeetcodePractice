class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> score = new Stack<>();
        for(String op:ops){
            if(op.equals("+")){
                int score1 = score.pop();
                int score2 = score.peek();
                score.push(score1);
                score.push(score1+score2);
            }else if(op.equals("D")){
                int s = score.peek();
                score.push(s*2);
            }else if(op.equals("C")){
                score.pop();
            }else{
                int s = Integer.parseInt(op);
                score.push(s);
            }
        }
        int sum =0;
        for(int s: score){
            sum+= s;
        }
        return sum;
    }
}