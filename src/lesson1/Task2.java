package lesson1;

/* Задание 2
https://leetcode.com/problems/merge-sorted-array/
 */
public class Task2 {
    public static void main(String[] args) {
        //Test cases
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
        merge(new int[]{1}, 1, new int[]{}, 0);
        merge(new int[]{0}, 0, new int[]{1}, 1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int firstIndex = 0;
        int secondIndex = 0;
        int num1Pointer;

        while (firstIndex < m && secondIndex < n) {
            num1Pointer = firstIndex + secondIndex;
            if (nums1[num1Pointer] < nums2[secondIndex]) {
                firstIndex++;
                continue;
            }

            shiftArray(nums1, num1Pointer, nums1.length - 1);
            nums1[num1Pointer] = nums2[secondIndex];
            secondIndex++;
        }

        // заполняем оставшиеся элементы второго массива
        while (secondIndex < n) {
            num1Pointer = firstIndex + secondIndex;
            nums1[num1Pointer] = nums2[secondIndex];
            secondIndex++;
        }
    }

    // смещение элементов массива на одну позицию вправо
    private static void shiftArray(int[] arr, int startIndex, int endIndex) {
        for (int j = endIndex; j > startIndex ; j--) {
            arr[j] = arr[j - 1];
        }
    }
}
