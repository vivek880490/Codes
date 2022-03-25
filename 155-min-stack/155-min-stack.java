class MinStack {
    
    Stack<Integer> st;
    Stack<Integer> ss;

    public MinStack() {
        st = new Stack<>();
        ss = new Stack<>();
    }
    
    public void push(int val) {
        
        st.push(val);
        
        if(ss.size() == 0 || ss.peek() >= val){
            ss.push(val);
            return;
        }
        
    }
    
    public void pop() {
        int top = st.peek();
        if(st.size() != 0){
            
            st.pop();
        }
        
        if(top == ss.peek()){
            ss.pop();
        }
        
    }
    
    public int top() {
        
        
        if(st.size() == 0) return -1;
        return st.peek();
        
    }
    
    public int getMin() {
        if(ss.size() == 0){
            return -1;
        }
        return ss.peek();
        
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