package lesson4;

/* Задание 3
https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
 */
public class Task3 {
    public static void main(String[] args) {
        //Test cases
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
        System.out.println(maxDepth("(1)+((2))+(((3)))"));
        System.out.println(maxDepth(""));
        System.out.println(maxDepth("()()"));
        System.out.println(maxDepth("()(()())"));
    }

    public static int maxDepth(String s) {
        int maxDepth = 0;
        int bracketsStackCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                bracketsStackCount++;
                if (maxDepth < bracketsStackCount) {
                    maxDepth = bracketsStackCount;
                }

                continue;
            }

            if (c == ')') {
                bracketsStackCount--;
            }
        }

        return maxDepth;
    }
}
