class BrowserHistory {
    /*
        2 stacks;
        every time you visit a website, push it into stack A;
        if you want to go back:
            pop from A
            push that element to stack B
        if you want to go forward;
            pop from B
            push that to stack A
        
    */
    Stack<String> forward = new Stack<>();
    Stack<String> currentPage = new Stack<>();
    public BrowserHistory(String homepage) {
        currentPage.push(homepage);
    }
    
    public void visit(String url) {
        currentPage.push(url);
        forward = new Stack<>();
    }
    
    public String back(int steps) {
        while(steps-- >0 && !currentPage.isEmpty()){
            forward.push(currentPage.pop());
        }
        if(currentPage.isEmpty()){
            currentPage.push(forward.pop());
        }
        return currentPage.peek();
    }
    
    public String forward(int steps) {
        while(steps-- >0 && !forward.isEmpty()){
            currentPage.push(forward.pop());
        }
        return currentPage.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */