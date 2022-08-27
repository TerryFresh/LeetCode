package LeetCode;

//Medium

//You are given an integer n. We reorder the digits in any order (including the original order) such that the leading digit is not zero.
//Return true if and only if we can do this so that the resulting number is a power of two.

//Вам дано целое число n. Мы переупорядочиваем цифры в любом порядке (включая исходный порядок) так, чтобы старшая цифра не была равна нулю.
//Вернуть true тогда и только тогда, когда мы можем сделать так, чтобы результирующее число было степенью двойки.

import java.util.Arrays;

public class I869ReorderedPowerOf2 {
    public static void main(String[] args) {
        int n = 1024;
        int s = 2;
        System.out.println(reorderedPowerOf2(n));

    }

    public static boolean reorderedPowerOf2(int n) {
        if ((Math.log10(n) / Math.log10(2) % 1 == 0)){
            return true;
        }

        int[] powerTwoSorted = new int[]{2, 4, 8, 16, 32, 64,
                128, 256, 512,
                1024, 2048, 4096, 8192,
                16384, 32768, 65536,
                131072, 262144, 524288,
                1048576, 2097152, 4194304, 8388608,
                16777216, 33554432, 67108864,
                134217728, 268435456, 536870912,
                1073741824};

        for (int i = 0; i < 30; ++i) {
            char[] numbres = String.valueOf(n).toCharArray();
            char[] digits = String.valueOf(powerTwoSorted[i]).toCharArray();
            Arrays.sort(numbres);
            Arrays.sort(digits);
            if (Arrays.equals(numbres, digits))
                return true;
        }
        return false;
    }
}
//Runtime: 3 ms, faster than 44.67% of Java online submissions for Reordered Power of 2.

//    public static boolean reorderedPowerOf2(int n) {
//        if ((Math.log10(n) / Math.log10(2) % 1 == 0)){
//            return true;
//        }
//
//        char[] number = sortedDigits(n);;
//
//        for (int i = 0; i < 30; ++i) {
//            char[] powerOfTwo = sortedDigits(1 << i);
//            if (Arrays.equals(number, powerOfTwo))
//                return true;
//        }
//        return false;
//    }
//
//    private static char[] sortedDigits(int n) {
//        char[] digits = String.valueOf(n).toCharArray();
//        Arrays.sort(digits);
//        return digits;
//    }
//}//Runtime: 3 ms, faster than 44.67% of Java online submissions for Reordered Power of 2.

