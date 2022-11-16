package lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Задание 3
https://leetcode.com/problems/intersection-of-two-arrays-ii/
 */
public class Task3 {
    public static void main(String[] args) {
        //Test cases
        for (int num : intersect(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 })) {
            System.out.print(num + ", ");
        }
        System.out.println();

        for (int num : intersect(new int[] { 4, 9, 5 }, new int[] { 9, 4, 9, 8, 4 })) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> lst = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                map.replace(nums1[i], map.get(nums1[i]) + 1);
            } else {
                map.put(nums1[i], 1);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                lst.add(nums2[i]);
                map.replace(nums2[i], map.get(nums2[i]) - 1);
            }
        }

        int[] result = new int[lst.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = lst.get(i);
        }

        return result;
    }
}
