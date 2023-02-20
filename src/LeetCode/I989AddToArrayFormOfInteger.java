package LeetCode;

//Easy

//The array-form of an integer num is an array representing its digits in left to right order.
//For example, for num = 1321, the array form is [1,3,2,1].
//Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

//Массивная форма целого числа представляет собой массив, представляющий его цифры в порядке слева направо.
//Например, для num = 1321 форма массива будет [1,3,2,1].
//Учитывая num, форму массива целого числа и целое число k, вернуть форму массива целого числа num + k.

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class I989AddToArrayFormOfInteger {

    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k = 34;

        System.out.println(addToArrayForm(num, k));
    }

//    public static List<Integer> addToArrayForm(int[] num, int k) {
//        String s = String.valueOf(k);
//        String m = "";
//
//        if (s.length() >= num.length){
//
//        }
//        return arrayList;
//    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        String[] result;

        BigDecimal secondValue = new BigDecimal(k);
        String s = "";
        for (int i = 0; i < num.length; i++) {
            s += num[i];
        }
        BigDecimal firstValue = new BigDecimal(s);
        firstValue = firstValue.add(secondValue);

        result = firstValue.toString().split("");

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < result.length; i++) {
            arrayList.add(Integer.valueOf(result[i]));
        }
        return arrayList;
    }
//Runtime 191 ms - beats 5.7%  || Memory 44.3 MB - beats 24.87%
}
