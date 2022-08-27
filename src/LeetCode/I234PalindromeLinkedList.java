package LeetCode;

//Easy

//Given the head of a singly linked list, return true if it is a palindrome.

//Даётся заголовок односвязного списка, вернуть true, если это палиндром.

import java.util.ArrayList;

public class I234PalindromeLinkedList {

    public static void main(String[] args) {
        var head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));

        var currentNode = head;
        while (currentNode != null){
            System.out.println(currentNode.val);
            currentNode = currentNode.next;
        }

        System.out.println(isPalindrome(head));
    }

    public static boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();

        var currentNode = head;
        while (currentNode != null){
            arr.add(currentNode.val);
            currentNode = currentNode.next;
        }
        for (int i = 0; i < arr.size()-1; i++) {
            if (arr.get(i) != arr.get(arr.size()-(i+1))){
                return false;
            }
        }
        return true;
    }

}
//Runtime: 21 ms, faster than 28.80% of Java online submissions for Palindrome Linked List.

