package LeetCode.NoSolution;

//Your task is to calculate ab mod 1337 where a is a positive integer and b is an extremely large positive integer given in the form of an array.

//Ваша задача — вычислить ab mod 1337, где a — положительное целое число, а b — очень большое положительное целое число, заданное в виде массива.

public class I372SuperPow {
    public static void main(String[] args) {
        int a = 5;
        int[] b = {4, 5};

        System.out.println(superPow(a, b));
    }

    public static int superPow(int a, int[] b) {
        String s = "";
        for (int i = 0; i < b.length; i++) {
            s += b[i];
        }
        int n = Integer.parseInt(s);

        return a = (int) Math.pow(a, n);
    }
}
