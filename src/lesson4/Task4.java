package lesson4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/* Задание 4
https://leetcode.com/problems/remove-outermost-parentheses/
 */
public class Task4 {
    public static void main(String[] args) {
        //Test cases
        System.out.println(removeOuterParentheses("(()())(())"));
        System.out.println(removeOuterParentheses("(()())(())(()(()))"));
        System.out.println(removeOuterParentheses("()()"));
        System.out.println(removeOuterParentheses(""));
    }

    public static String removeOuterParentheses(String s) {
        Deque<Character> result = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int bracketsCounter = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result.addLast(c);

            if (c == '(') {
                bracketsCounter++;
                continue;
            }

            if (c == ')') {
                bracketsCounter--;

                if (bracketsCounter == 0) {
                    result.pollFirst();
                    result.pollLast();

                    while (!result.isEmpty()) {
                        sb.append(result.pollFirst());
                    }
                }
            }
        }

        return sb.toString();
    }
}
