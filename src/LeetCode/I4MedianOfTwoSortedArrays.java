package LeetCode;

//Hard

//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

//Учитывая два отсортированных массива nums1 и nums2 размера m и n соответственно, вернуть медиану двух отсортированных массивов.

import java.util.ArrayList;
import java.util.Collections;

public class I4MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 3, 6, 7};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double mediana = 0.0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            list.add(nums2[i]);
        }

        Collections.sort(list);

        if (list.size() % 2 != 0 && list.size() > 2) {
            mediana = list.get(list.size() / 2);
        }
        if (list.size() % 2 == 0 && list.size() > 1) {
            mediana = (list.get(list.size() / 2) + list.get(list.size() / 2 - 1)) / 2.0;
        }
        if (list.size() == 1) {
            mediana = list.get(0);
        }
        if (list.size() == 2) {
            mediana = (list.get(1) + list.get(0)) / 2.0;
        }
        return mediana;
    }
}
//Runtime: 12 ms, faster than 15.66% of Java online submissions for Median of Two Sorted Arrays.
