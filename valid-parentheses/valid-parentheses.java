class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char a: s.toCharArray()) {
            if(a == '(' || a == '[' || a == '{') {
                stack.push(a);
            } else if(stack.isEmpty()) {
                return false;
            } else if(a == ')' && stack.pop() != '(') {
                return false;
            } else if(a == ']' && stack.pop() != '[') {
                return false;
            } else if(a == '}' && stack.pop() != '{') {
                return false;
            }
        }
        
        return stack.empty();
    }
}