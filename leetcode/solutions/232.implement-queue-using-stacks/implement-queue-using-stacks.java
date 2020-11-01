class MyQueue {

    Stack<Integer> oldStack, newStack;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        oldStack = new Stack<>();
        newStack = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        newStack.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        shiftStack();
        return oldStack.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        shiftStack();
        return oldStack.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return oldStack.isEmpty() && newStack.isEmpty();
    }

    private void shiftStack() {
        if (oldStack.isEmpty()) {
            while (!newStack.isEmpty()) {
                oldStack.push(newStack.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */