package lesson1;

/* Задание 4
https://leetcode.com/problems/valid-palindrome/
 */
public class Task4 {
    public static void main(String[] args) {
        //Test cases
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {
        int startIndex = 0;
        int endIndex = s.length() - 1;

        while (startIndex < endIndex) {
            if (!Character.isLetter(s.charAt(startIndex)) && !Character.isDigit(s.charAt(startIndex))) {
                startIndex++;
                continue;
            }

            if (!Character.isLetter(s.charAt(endIndex)) && !Character.isDigit(s.charAt(endIndex))) {
                endIndex--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(startIndex)) != Character.toLowerCase(s.charAt(endIndex))) {
                return false;
            }

            startIndex++;
            endIndex--;
        }

        return true;
    }
}
