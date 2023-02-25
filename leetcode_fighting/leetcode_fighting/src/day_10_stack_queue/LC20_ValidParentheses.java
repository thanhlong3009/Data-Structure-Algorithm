package day_10_stack_queue;

import java.util.Stack;

public class LC20_ValidParentheses {
    public static void main(String[] args) {
        String s = "){";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        if (s.length() % 2 == 1){
            return false;
        }
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char i : chars){
            if (i == '[' || i == '{' || i == '(') {
                stack.push(i);
            }else {
                if (stack.isEmpty() ||(i == ']' && stack.peek() != '[') || (i == '}' && stack.peek() != '{') || (i == ')' && stack.peek() != '(')) {
                    return false;
                }else {
                    stack.pop();
                }

            }
        }
        return stack.isEmpty();
    }
}
