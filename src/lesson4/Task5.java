package lesson4;

/* Задание 5
https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class Task5 {
    public static void main(String[] args) {
        //Test cases
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode pointer = mergeTwoLists(list1, list2);
        while (pointer != null) {
            System.out.println(pointer.val);
            pointer = pointer.next;
        }
    }

    private static ListNode head = null;

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode nextPointer = null;
        ListNode list1Pointer = list1;
        ListNode list2Pointer = list2;

        while (list1Pointer != null && list2Pointer != null) {
            if (list1Pointer.val < list2Pointer.val) {
                nextPointer = appendNode(nextPointer, list1Pointer);
                list1Pointer = list1Pointer.next;
                continue;
            }

            nextPointer = appendNode(nextPointer, list2Pointer);
            list2Pointer = list2Pointer.next;
        }

        while (list1Pointer != null) {
            nextPointer = appendNode(nextPointer, list1Pointer);
            list1Pointer = list1Pointer.next;
        }

        while (list2Pointer != null) {
            nextPointer = appendNode(nextPointer, list2Pointer);
            list2Pointer = list2Pointer.next;
        }

        return head;
    }

    private static ListNode appendNode(ListNode nextPointer, ListNode node) {
        if (nextPointer == null) {
            nextPointer = new ListNode(node.val);
            head = nextPointer;
            return nextPointer;
        }

        nextPointer.next = new ListNode(node.val);
        return nextPointer.next;
    }
}