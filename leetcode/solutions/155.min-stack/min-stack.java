class MinStack {

    Stack<Integer> stack;
        Stack<Integer> minStack;
        int min;

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            minStack = new Stack<>();
            min = Integer.MAX_VALUE;
        }

        public void push(int x) {
            if (x <= min) {
                minStack.push(min);
                min = x;
            }
            minStack.push(x);
        }

        public void pop() {
            if(minStack.pop() == min) min=minStack.pop();
        }

        public int top() {
            return minStack.peek();
        }

        public int getMin() {
            return min;
        }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */