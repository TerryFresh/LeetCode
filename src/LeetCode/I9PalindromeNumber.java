package LeetCode;

//Easy

//Given an integer x, return true if x is a palindrome, and false otherwise.

//Учитывая целое число x, вернуть true, если x является палиндромом, и false в противном случае.

import java.util.*;

public class I9PalindromeNumber {
    public static void main(String[] args) {
//        int x = 121; //true
//        int x = -121; //false
//        int x = 10; //false
        int x = 1234567899; //false
        System.out.println(isPalindrome(x));
    }

//    public static boolean isPalindrome(int x) {
//        if (x < 0) {
//            return false;
//        }
//        String result = "";
//        for (int i = String.valueOf(x).split("").length - 1; i >= 0 ; i--) {
//            result += (String.valueOf(x).split("")[i]);
//        }
//
//        return result.equals(String.valueOf(x));
//    }
//}
////Runtime: 282 ms, faster than 5.10% of Java online submissions for Palindrome Number.

//    public static boolean isPalindrome(int x) {
//        if (x < 0) {
//            return false;
//        }
//
//        String s = "";
//        int y = x;
//
//        for (int i = 0; i < String.valueOf(x).split("").length; i++) {
//                s += y % 10;
//                y = y/10;
//        }
//
//        return s.equals(String.valueOf(x));
//    }
//}
//Runtime: 157 ms, faster than 5.10% of Java online submissions for Palindrome Number.

//    public static boolean isPalindrome(int x) {
//        if (x < 0) {
//            return false;
//        }
//
//        long y = Long.parseLong(new StringBuilder(String.valueOf(x)).reverse().toString());
//
//        return y == x;
//    }
//}
//Runtime: 22 ms, faster than 16.17% of Java online submissions for Palindrome Number.

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        StringBuilder sb1 = new StringBuilder();
        sb1.append(x).reverse();

        return sb1.toString().equals(String.valueOf(x));
    }
}
//Runtime: 11 ms, faster than 81.20% of Java online submissions for Palindrome Number.