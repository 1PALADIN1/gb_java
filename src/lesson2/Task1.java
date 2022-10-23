package lesson2;

/* Задание 1
https://leetcode.com/problems/powx-n/
 */
public class Task1 {
    public static void main(String[] args) {
        //Test cases
        System.out.println(myPow(2.00000, 10));
        System.out.println(myPow(2.10000, 3));
        System.out.println(myPow(2.00000, -2));
    }

    private static double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        if (x == 0 || x == 1) return x;

        if (n < 0) {
            // negative
            return 1 / x * myPow(1 / x, -(n + 1));
        }

        // positive
        double result = myPow(x, n / 2);
        result = result * result;
        if (n % 2 == 1) {
            result *= x;
        }

        return result;
    }
}
