class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) return false;
                if (s.charAt(i) == ')') {
                    if (!stack.pop().equals('(')) {
                        return false;
                    }
                } else if (s.charAt(i) == ']') {
                    if (!stack.pop().equals('[')) {
                        return false;
                    }
                } else if (s.charAt(i) == '}') {
                    if (!stack.pop().equals('{')) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}