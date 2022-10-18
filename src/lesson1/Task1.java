package lesson1;

/* Задание 1
https://leetcode.com/problems/remove-element/
 */
public class Task1 {
    public static void main(String[] args) {
        //Test cases
        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
        System.out.println(removeElement(new int[]{3, 3}, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int k = nums.length;
        for (int i = 0; i < k; i++) {
            if (nums[i] == val) {
                boolean swapped = false;

                // ищем элемент с конца, который можем
                // подставить на место удаляемого элемента
                // (и меняем эти элементы местами)
                for (int j = k - 1; j > i; j--) {
                    if (nums[j] != val) {
                        int tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;

                        swapped = true;
                        break;
                    }
                }

                if (!swapped) {
                    // свапа не было - все удаляемые элементы в конце массива
                    k = i;
                    break;
                }

                k--;
            }
        }

        return k;
    }
}
