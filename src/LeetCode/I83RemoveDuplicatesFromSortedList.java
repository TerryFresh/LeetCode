package LeetCode;

//Easy

//Given an m x n matrix matrix and an integer k, return the max sum of a rectangle in the matrix such that its sum is no larger than k.
//It is guaranteed that there will be a rectangle with a sum no larger than k.

//Дана матричная матрица размера m x n и целое число k, вернуть максимальную сумму прямоугольника в матрице так, чтобы его сумма не превышала k.
//Гарантируется, что найдется прямоугольник с суммой, не превышающей k.

public class I83RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {

        var head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(2))));

        System.out.println(deleteDuplicates(head));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode slow = head, fast = head;

        while (fast != null) {
            if (slow.val != fast.val) {
                slow.next = fast;
                slow = slow.next;
            }
            fast = fast.next;
        }
        // end slow pointer
        slow.next = null;

        return head;
    }
}
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted List.

