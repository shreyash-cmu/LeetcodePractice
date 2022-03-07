class MinStack {
    Stack<int[]> stack;
    int min;
    public MinStack() {
        this.stack = new Stack();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(val < min){
            this.min = val;
            this.stack.push(new int[]{val,val});
            return;
        }
        this.stack.push(new int[]{val,min});
        return;
    }
    
    public void pop() {
        this.stack.pop();
        if(this.stack.isEmpty()){
            min = Integer.MAX_VALUE;
        }else{
            min = this.stack.peek()[1];
        }
    }
    
    public int top() {
        return this.stack.peek()[0];
    }
    
    public int getMin() {
        return this.stack.peek()[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */