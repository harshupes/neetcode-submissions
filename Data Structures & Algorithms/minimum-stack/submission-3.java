class MinStack {

    Stack < Integer > st = new Stack<>();
    Stack < Integer > minSt = new Stack<>();

    public MinStack() {
        Stack < Integer > st = new Stack<>();
        Stack < Integer > minSt = new Stack<>();
    }
    
    public void push(int val) {
        
        st.push(val);

        if (minSt.isEmpty())
        {
            minSt.push(val);
        }
        else
        {
            minSt.push(Math.min(val,minSt.peek()));  
        }
    }
    
    public void pop() {
        minSt.pop();
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minSt.peek();
    }
}
