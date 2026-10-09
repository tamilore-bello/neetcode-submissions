class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    int min = -33;

    public MinStack() {
        
    }
    
    public void push(int val) {
        if (stack.empty()) { min = val; }
        else if (val <= min) { 
            minStack.push(min);
            min = val;
        }
        stack.push(val);
    }
    
    public void pop() {
        if (stack.pop() == min) 
            if (!minStack.empty())
                min = minStack.pop();
            else
                min = -33;
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}
// did in 10 min, restarted.

// typical use of stack for push/pop operations.
// every new minimum, add the last minimum to a stack. or store all the

// minimum is 4. then 2 comes around. set 2 to new min, add 4 to min stack.
// 4 -> 2
// minimum then 1 comes along. 1 is new minimum, 2 in min stack.
// 4 -> 2 -> 1
// pop 1, since it's the current min, we set that to the stack. 
// add 6, 7, 0, 9. 
// atp 0 is the new minimum 

//min is 3.
// 0, 3, 4, 5, 6, 7, 5, 4
// pop all the way to 

// -2, -2, -3, -3

