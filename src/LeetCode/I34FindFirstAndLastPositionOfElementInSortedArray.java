package LeetCode;

//Easy

//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].
//You must write an algorithm with O(log n) runtime complexity.

//Учитывая массив целых чисел, отсортированных в неубывающем порядке, найдите начальную и конечную позицию заданного целевого значения.
//Если цель не найдена в массиве, вернуть [-1, -1].
//Вы должны написать алгоритм со сложностью выполнения O(log n).

import java.util.Arrays;

public class I34FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};

        int min = 0;
        int max = nums.length - 1;

        while (min <= max) {
            int middle = min + (max - min) / 2;
            if (nums[middle] >= target) {
                max = middle - 1;
            } else {
                min = middle + 1;
            }
            if (nums[middle] == target) res[0] = middle;
        }

        min = 0;
        max = nums.length - 1;

        while (min <= max) {
            int middle = min + (max - min) / 2;
            if (nums[middle] <= target) {
                min = middle + 1;
            } else {
                max = middle - 1;
            }
            if (nums[middle] == target) res[1] = middle;
        }

        return res;
    }
}
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Find First and Last Position of Element in Sorted Array.
