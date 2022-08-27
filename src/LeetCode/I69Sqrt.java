package LeetCode;

//Easy

//Given a non-negative integer x, compute and return the square root of x.
//Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
//Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.

//Учитывая неотрицательное целое число x, вычислите и верните квадратный корень из x.
//Поскольку тип возвращаемого значения — целое число, десятичные цифры усекаются, и возвращается только целая часть результата.
//Примечание. Вам не разрешено использовать какие-либо встроенные функции экспоненты или операторы, такие как pow(x, 0.5) или x ** 0.5.

public class I69Sqrt {
    public static void main(String[] args) {
        int x = 2147483647;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        long start = 0;
        int result = 0;

        for (int i = 0; i > -1; i++) {
            start = (long) i * i;
            if (start == x) {
                result = i;
                break;
            }
            if (start > x) {
                result = i - 1;
                break;
            }
        }
        return result;
    }
}
//Runtime: 43 ms, faster than 8.02% of Java online submissions for Sqrt(x).
