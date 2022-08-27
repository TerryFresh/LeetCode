package LeetCode;

//Easy

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.

//Учитывая массив целых чисел nums и целочисленную цель, вернуть индексы двух чисел так, чтобы они складывались в цель.
//Вы можете предположить, что каждый вход будет иметь ровно одно решение, и вы не можете использовать один и тот же элемент дважды.
//Вы можете вернуть ответ в любом порядке.

import java.util.Arrays;

public class I1TwoSum {
    public static void main(String[] args) {
        int[] i = {1, 5, 5, 6, 10};
        int b = 10;
        System.out.println(Arrays.toString(twoSum(i, b)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = j;
                    result[1] = i;
                }
            }
        }
        return result;
    }
}
//Runtime: 51 ms, faster than 43.98% of Java online submissions for Two Sum.
