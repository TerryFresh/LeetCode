package LeetCode.NoSolution;

//Easy

//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//You must write an algorithm with O(log n) runtime complexity.

//Учитывая отсортированный массив различных целых чисел и целевое значение, вернуть индекс, если цель найдена. Если нет, верните индекс туда, где он был бы, если бы он был вставлен по порядку.
//Вы должны написать алгоритм со сложностью выполнения O(log n).

public class I35SearchInsertPosition {
    public static void main(String[] args) {
//        int[] nums = {1,3,5,6};
//        int target = 3;
//
//        int[] nums = {1,3,5,6};
//        int target = 2;

        int[] nums = {1,3,5,6};
        int target = 7;

        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end){
            int search = start + (end - start)/2;
            if (nums[search] == target) {
                return search;
            }
            if (nums[search] > target) {
                end = search-1;
            }
            if (nums[search] < target) {
                start = search +1;
            }
        }
        return start;
    }
}
//Runtime 0 ms Beats 100% || Memory 41.8 MB Beats 61.63%