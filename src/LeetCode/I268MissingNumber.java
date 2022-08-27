package LeetCode;

//Easy

//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

//Учитывая массив nums, содержащий n различных чисел в диапазоне [0, n], вернуть единственное число в диапазоне, отсутствующее в массиве.

public class I268MissingNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 4, 2, 1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int result = (nums.length * (nums.length + 1) / 2); //арифметическая прогрессия 0+1+2+3+4...
        for (int num : nums) {
            result -= num;
        }
        return result;
    }
}
//Runtime: 1 ms, faster than 65.99% of Java online submissions for Missing Number.


//    public static int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//        int result = -1;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] != nums[i-1]+1){
//                result = nums[i]-1;
//            }
//        }
//        if (result == -1){
//            result = nums[nums.length-1]+1;
//        }
//        if (nums[0] != 0){
//            result = 0;
//        }
//        return result;
//    }
//}
//Runtime: 6 ms, faster than 26.18% of Java online submissions for Missing Number.