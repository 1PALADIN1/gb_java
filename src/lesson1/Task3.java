package lesson1;

import java.util.Stack;

/* Задание 3
https://leetcode.com/problems/reverse-words-in-a-string/
 */
public class Task3 {
    public static void main(String[] args) {
        //Test cases
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello world  "));
        System.out.println(reverseWords("a good   example"));
    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (Character.isSpaceChar(ch)) {
                releaseStack(stack, sb);
            } else {
                stack.push(ch);
            }
        }

        releaseStack(stack, sb);
        return sb.toString();
    }

    private static void releaseStack(Stack<Character> stack, StringBuilder sb) {
        if (!stack.isEmpty()) {
            if (!sb.isEmpty()) {
                sb.append(' ');
            }

            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
        }
    }
}
