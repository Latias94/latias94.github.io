class Solution {
    public int calPoints(String[] ops) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        for (String str : ops) {
            if (str.equals("C")) {
                res -= stack.pop();
            } else if (str.equals("D")) {
                stack.push(stack.peek() * 2);
                res += stack.peek();
            } else if (str.equals("+")) {
                int last = stack.pop();
                int newOne = last + stack.peek();
                stack.push(last);
                stack.push(newOne);
                res += stack.peek();
            } else {
                stack.push(Integer.parseInt(str));
                res += Integer.parseInt(str);
            }
        }
        return res;
    }
}