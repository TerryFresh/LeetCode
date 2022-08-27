package LeetCode;

//Easy

//Given an integer n, return true if it is a power of two. Otherwise, return false.
//An integer n is a power of two, if there exists an integer x such that n == 2x.

//Учитывая целое число n, вернуть true, если оно является степенью двойки. В противном случае вернуть ложь.
//Целое число n является степенью двойки, если существует целое число x такое, что n == 2x.

public class I231PowerOfTwo {
    public static void main(String[] args) {
        int n = 256;
        System.out.println(isPowerOfTwo(n));
    }

    public static boolean isPowerOfTwo(int n) {
        return Math.log10(n)/Math.log10(2)%1 == 0;
    }
}
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Power of Two.

//    public static boolean isPowerOfTwo(int n) {
//        while (n >= 2) {
//            if (n % 2 != 0) {
//                return false;
//            }
//            n = n / 2;
//        }
//        return n == 1;
//    }
//}
//Runtime: 2 ms, faster than 72.24% of Java online submissions for Power of Two.
