package LeetCode.NoSolution;

//Medium

//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.

//Вам даны два непустых связанных списка, представляющих два неотрицательных целых числа. Цифры хранятся в обратном порядке, и каждый из их узлов содержит одну цифру. Добавьте два числа и верните сумму в виде связанного списка.
//Вы можете предположить, что эти два числа не содержат начальных нулей, кроме самого числа 0.

import java.util.ArrayList;
import java.util.LinkedList;

public class I2AddTwoNumbers {
    public static void main(String[] args) {
//        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
//        ListNode l2 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));

        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));


        System.out.println(addTwoNumbers(l1, l2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        while (l1 != null){
            list1.add(l1.val);
            l1 = l1.next;
        }

        while (l2 != null){
            list2.add(l2.val);
            l2 = l2.next;
        }

        String s1 = "";
        String s2 = "";

        for (int i = list1.size()-1; i >= 0; i--) {
            s1 += list1.get(i);
        }
        for (int i = list2.size()-1; i >= 0; i--) {
            s2 += list2.get(i);
        }

        Long result = Long.parseLong(s1) + Long.parseLong(s2);
        String res = result.toString();
        String[] str = res.split("");
        System.out.println(result);

        ListNode head = new ListNode();
        ListNode ptr = head;

        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] arr = new int[res.length()];

        for (int i = res.length()-1; i >= 0; i--) {
            arrayList.add(Integer.parseInt(str[i]));
            arr[i] = Integer.parseInt(str[i]);

            ptr.next = new ListNode(arr[i]);
            ptr = ptr.next;
        }
        System.out.println(ptr.val);
        return head.next;

    }
}
