package LeetCode.NoSolution;

//Medium

//Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
//You must solve this problem without using the library's sort function.
//Follow up: Could you come up with a one-pass algorithm using only constant extra space?

//Дан массив nums с n объектами, окрашенными в красный, белый или синий цвет, отсортируйте их на месте так, чтобы объекты одного цвета были смежными, а цвета располагались в порядке красный, белый и синий.
//Мы будем использовать целые числа 0, 1 и 2 для обозначения красного, белого и синего цветов соответственно.
//Вы должны решить эту проблему, не используя библиотечную функцию сортировки.
//Дополнение: не могли бы вы придумать однопроходный алгоритм, использующий только постоянное дополнительное пространство?

import java.util.ArrayList;
import java.util.Arrays;

public class I75SortColors {
    public static void main(String[] args) {
//        int[] nums = new int[]{2,0,2,1,1,0}; //Output: [0,0,1,1,2,2]
        int[] nums = new int[]{1,1,2,2,0,0}; //Output: [0,0,1,1,2,2]
//        int[] nums = new int[]{1, 0}; //Output: [0,1]

        sortColors(nums);
    }

//    public static void sortColors(int[] nums) {
//        for (int i = 0; i < nums.length-1; i++) {
//            for (int j = 0; j < nums.length-1; j++) {
//                if (nums[j] >= nums[j+1]) {
//                    int interval = nums[j];
//                    nums[j] = nums[j+1];
//                    nums[j+1] = interval;
//                }
//            }
//        }
//    System.out.println(Arrays.toString(nums));
//    }
//}
//Runtime: 2 ms, faster than 15.40% of Java online submissions for Sort Colors.

    public static void sortColors(int[] nums) {

    }
}
