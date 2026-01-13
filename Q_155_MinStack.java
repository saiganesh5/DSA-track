class MinStack {
    Stack<Integer> stack;
    Stack<Integer> extra;
    public MinStack() {
        stack = new Stack<>();extra=new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(extra.isEmpty()){
            extra.push(val);
        }
        else{
            extra.push(Math.min(extra.peek(),val));
        }
        
    }
    
    public void pop() {
        stack.pop();
        extra.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return extra.peek();
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
