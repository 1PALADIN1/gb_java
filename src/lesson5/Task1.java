package lesson5;

import java.util.HashMap;
import java.util.Map;

/* Задание 1
https://leetcode.com/problems/contains-duplicate-ii/
 */
public class Task1 {
    public static void main(String[] args) {
        //Test cases
        System.out.println(containsNearbyDuplicate(new int[]{ 1, 2, 3, 1 }, 3));
        System.out.println(containsNearbyDuplicate(new int[]{ 1, 0, 1, 1 }, 1));
        System.out.println(containsNearbyDuplicate(new int[]{ 1, 2, 3, 1, 2, 3 }, 2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> indices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (indices.containsKey(nums[i]) && (i - indices.get(nums[i])) <= k) {
                return true;
            }

            indices.put(nums[i], i);
        }

        return false;
    }
}
