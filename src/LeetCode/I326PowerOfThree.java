package LeetCode;

//Easy

//Given an integer n, return true if it is a power of three. Otherwise, return false.
//An integer n is a power of three, if there exists an integer x such that n == 3x.

//Для заданного целого числа n вернуть true, если оно является степенью числа три. В противном случае вернуть ложь.
//Целое число n является степенью числа три, если существует целое число x такое, что n == 3x.

public class I326PowerOfThree {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(isPowerOfThree(n));
    }

    public static boolean isPowerOfThree(int n) {
        while (n >= 3) {
            if (n % 3 != 0) {
                return false;
            }
            n = n / 3;
        }
        return n == 1;
    }
}
//Runtime: 18 ms, faster than 85.91% of Java online submissions for Power of Three.

//    public static boolean isPowerOfThree(int n) {
//        return Math.log10(n)/Math.log10(3)%1 == 0;
//    }
//}
//Runtime: 19 ms, faster than 80.11% of Java online submissions for Power of Three.

//    public static boolean isPowerOfThree(int n) {
//        int[] arr = new int[]{3, 9, 27, 81, 243, 729, 2187, 6561, 19683, 59049, 177147, 531441, 1594323, 4782969, 14348907, 43046721, 129140163, 387420489, 1162261467};
//        boolean result = false;
//        for (int i = 0; i < arr.length; i++) {
//            if (n == arr[i]){
//                result = true;
//            }
//        }
//        if(n==1) result = true;
//
//        return result;
//    }
//Runtime: 22 ms, faster than 62.48% of Java online submissions for Power of Three.

//    public static boolean isPowerOfThree(int n) {
//        boolean result = false;
//        int[] arr = new int[]{3, 9, 27, 81, 243, 729, 2187, 6561, 19683, 59049, 177147, 531441, 1594323, 4782969, 14348907, 43046721, 129140163, 387420489, 1162261467};
//        return Arrays.stream(arr).filter(x -> x == n).anyMatch(x -> x == n);
//    }
//}
//Runtime: 58 ms, faster than 5.17% of Java online submissions for Power of Three.
