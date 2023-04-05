package LeetCode.konturContest;

//ограничение по времени на тест 1 секунда
//ограничение по памяти на тест 256 мегабайт

// Пусть задано число x, десятичная запись которого не содержит нулей. Рассмотрим все числа, которые можно получить из числа x
// перестановкой его цифр. Пусть M — наибольшее из таких чисел, а m — наименьшее. Определим число K(x) как M−m.
//
// Например, для x=6174 получаем M=7641, m=1467, K(x)=7641−1467=6174.
//
// Вычислите K(x) по заданному числу x.
//
// Входные данные В единственной строке записано целое число x (1≤x≤109−1). Десятичная запись x не содержит нулей.
//
// Выходные данные
// Выведите целое число K(x).
// Например, для x=6174 получаем M=7641 m=1467 K(x)=7641−1467=6174

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class IndianMath1 {
    public static void main(String[] args) throws IOException {

//        long m = System.currentTimeMillis();
//        long usedBytes = Runtime.getRuntime().totalMemory()- Runtime.getRuntime().freeMemory();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String x = reader.readLine();

        char[] charArrayNumbers = x.toCharArray();
        int[] arrayNumbers = new int[charArrayNumbers.length];

        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = Integer.parseInt(String.valueOf(charArrayNumbers[i]));
        }

        Arrays.sort(arrayNumbers);

        StringBuilder max = new StringBuilder();
        StringBuilder min = new StringBuilder();

        for (int i = 0; i < arrayNumbers.length; i++) {
            max.append(arrayNumbers[arrayNumbers.length - 1 - i]);
            min.append(arrayNumbers[i]);
        }

        int result = Integer.parseInt(String.valueOf(max)) - Integer.parseInt(String.valueOf(min));
        System.out.println(result);

//        System.out.println((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1048576 + "MB");
//        System.out.println((double) (System.currentTimeMillis() - m) + " Ms");

    }
}

