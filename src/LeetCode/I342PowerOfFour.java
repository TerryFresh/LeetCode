package LeetCode;

//Easy

//Given an integer n, return true if it is a power of four. Otherwise, return false.
//An integer n is a power of four, if there exists an integer x such that n == 4x.

//Для заданного целого числа n вернуть true, если оно является степенью числа четыре. В противном случае вернуть ложь.
//Целое число n является степенью числа четыре, если существует целое число x такое, что n == 4x.

public class I342PowerOfFour {

    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfFour(n));
    }

    public static boolean isPowerOfFour(int n) {
        return Math.log10(n) / Math.log10(4) % 1 == 0;
    }
}
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Power of Four.

//    public static boolean isPowerOfFour(int n) {
//        boolean res = false;
//        int[] array = new int[17];
//
//        for (int i = 0; i < 17; i++) {
//            array[i] = ((int) Math.pow(4, i));
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == n && array[i] != 2147483647) {
//                res = true;
//            }
//        }
//        return res;
//    }
//}
//Runtime: 2 ms, faster than 65.34% of Java online submissions for Power of Four.
