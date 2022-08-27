package LeetCode;

//Medium

//Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

//Реализуйте функцию pow(x, n), которая вычисляет x в степени n (т. е. xn).

public class I50Pow {
    public static void main(String[] args) {
        double x = 0.00;
        int n = -2;
        System.out.println(myPow(x, n));
    }

    public static double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        double result = 1.0;
        while (n != 0) {
            if ((n & 0x01) == 1) {
                result *= x;
            }
            x *= x;
            n /= 2;
        }
        return result;
    }
}
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Pow(x, n).
