package LeetCode;

//Easy

//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
//representing the number of elements in nums1 and nums2 respectively.
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
//To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
//and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

//Вам даны два массива целых чисел nums1 и nums2, отсортированные в неубывающем порядке, и два целых числа m и n,
//редставляющие количество элементов в nums1 и nums2 соответственно.
//Объедините nums1 и nums2 в один массив, отсортированный в неубывающем порядке.
//Окончательный отсортированный массив не должен возвращаться функцией, а должен храниться внутри массива nums1.
//Чтобы приспособиться к этому, nums1 имеет длину m + n, где первые m элементов обозначают элементы, которые должны быть объединены,
//а последние n элементов устанавливаются равными 0 и должны игнорироваться. nums2 имеет длину n.

import java.util.Arrays;

public class I88MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < nums1.length - m; i++) {
            nums1[i + m] = nums2[i];
        }
        //if (nums1.length - m >= 0) System.arraycopy(nums2, 0, nums1, 0 + m, nums1.length - m);    <---Replace idea
        Arrays.sort(nums1);
    }
}
//Runtime: 1 ms, faster than 41.20% of Java online submissions for Merge Sorted Array.