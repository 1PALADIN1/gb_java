package lesson2;

/* Задание 2
https://leetcode.com/problems/climbing-stairs/
 */
public class Task2 {
    public static void main(String[] args) {
        //Test cases
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
    }

    private static int climbStairs(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;

        calcFiboCache(n, arr);
        return arr[n];
    }

    private static int calcFiboCache(int n, int[] arr) {
        if (arr[n] != 0) {
            return arr[n];
        }

        arr[n] = calcFiboCache(n - 1, arr) + calcFiboCache(n - 2, arr);
        return arr[n];
    }
}
