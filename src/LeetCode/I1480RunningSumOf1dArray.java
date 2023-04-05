package LeetCode;

//Easy

//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//Return the running sum of nums.

//Дан массив nums. Мы определяем текущую сумму массива как runningSum[i] = sum(nums[0]…nums[i]).
//Возвращает текущую сумму чисел.

//Example 1:
//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
//Example 2:
//Input: nums = [1,1,1,1,1]
//Output: [1,2,3,4,5]
//Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
//Example 3:
//Input: nums = [3,1,2,10,1]
//Output: [3,4,6,16,17]

public class I1480RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};

    }

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        int a = result[0];
        for (int i = 1; i < result.length; i++) {
            a += nums[i];
            result[i] = a;
        }
        return result;
    }
}
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Running Sum of 1d Array.
