class Solution {
    public int reverse(int x) {
        String string = Integer.toString(x);

        Stack<Character> stack = new Stack<Character>();
        StringBuffer sb = new StringBuffer();
        boolean minus = false;
        boolean start = true;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '-') {
                minus = true;
            } else {
                stack.push(string.charAt(i));
            }
        }

        if (minus) {
            sb.append('-');
        }
        while (!stack.empty()) {
            if (stack.peek() == '0' && start) {
                stack.pop();
                if (stack.empty()) {
                    sb.append('0');
                }
            } else {
                sb.append(stack.pop());
                start = false;
            }
        }
        Long result = Long.decode(sb.toString());
        if (result>Integer.MAX_VALUE|| result<Integer.MIN_VALUE){
            return 0;
        }
        return result.intValue();
    }
}