package lesson4;

import java.util.Stack;

/* Задание 1
https://leetcode.com/problems/valid-parentheses/
 */
public class Task1 {
    public static void main(String[] args) {
        //Test cases
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
    }

    public static boolean isValid(String s) {
        Stack<Character> brackets = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                brackets.push(c);
                continue;
            }

            if (brackets.size() == 0) {
                return false;
            }

            if (brackets.pop() != invertBracket(c)) {
                return false;
            }
        }

        return brackets.size() == 0;
    }

    private static char invertBracket(char input) {
        switch (input) {
            case '}':
                return '{';
            case ')':
                return '(';
            case ']':
                return '[';
            default:
                throw new RuntimeException("Invalid bracket!");
        }
    }
}
