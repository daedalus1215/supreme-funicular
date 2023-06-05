package org.example.palindrome;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println("Substring: " + isValidPalindromeWithParentheses("()[]{}"));
        System.out.println("Substring: " + isValidPalindromeWithParentheses("()"));
        System.out.println("Substring: " + isValidPalindromeWithParentheses("(]"));

    }

    public static boolean isValidPalindromeWithParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if ( c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                }
                if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}