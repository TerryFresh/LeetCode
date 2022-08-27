package LeetCode;

//Easy

//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
//The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//Increment the large integer by one and return the resulting array of digits.

//Вам дано большое целое число, представленное в виде целочисленного массива цифр, где каждая цифра[i] — это i-я цифра целого числа.
//Цифры упорядочены от наиболее значащего к наименее значащему в порядке слева направо. Большое целое число не содержит ведущих нулей.
//Увеличьте большое целое число на единицу и верните результирующий массив цифр.

import java.util.Arrays;

class I66PlusOne {
    public static void main(String[] args) {
        int[] dig = new int[]{9, 9, 9, 9};

        System.out.println(Arrays.toString(plusOne(dig)));
    }

    public static int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while (digits[i] == 9) {
            digits[i] = 0;
            i--;
            if (i == -1) {
                int[] newArray = new int[digits.length + 1];
                newArray[0] = 1;
                return newArray;
            }
        }
        digits[i]++;
        return digits;
    }
}
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.

//    public static int[] plusOne(int[] digits) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        int count = 0;
//        for (int i = digits.length -1; i >= 0; i--) {
//            if (digits[i] == 9 ){
//                count++;
//            }else break;
//        }
//        if (count == digits.length) {
//            arrayList.add(1);
//            for (int i = 0; i < count; i++) {
//                arrayList.add(0);
//            }
//        } else {
//            for (int i = 0; i < digits.length-count; i++) {
//                if (i == digits.length-count-1){
//                    digits[i]+=1;
//                }
//                arrayList.add(digits[i]);
//            }
//            for (int i = 0; i < count; i++) {
//                arrayList.add(0);
//            }
//
//        }
//        int[] result = new int[arrayList.size()];
//        for (int i = 0; i < arrayList.size(); i++) {
//            result[i] = arrayList.get(i);
//        }
//
//
//        return result;
//    }
//}
//Runtime: 1 ms, faster than 29.49% of Java online submissions for Plus One.