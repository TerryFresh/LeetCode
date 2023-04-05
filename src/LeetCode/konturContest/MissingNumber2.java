package LeetCode.konturContest;

////ограничение по времени на тест 1 секунда
////ограничение по памяти на тест 256 мегабайт

// Дан массив из нечётного количества целых чисел. Массив обладает следующим свойством — если дополнить его ещё одним числом, все числа в массиве можно будет разбить на пары так, что сумма в каждой паре будет равна нулю.
// Скажите, какого числа не хватает в массиве.
//
// Входные данные
// В первой строке записано нечётное целое число n (1≤n≤99999). Далее в n строках записаны целые числа a1, ..., an — исходный массив (1≤|ai|≤1000).
//
// Выходные данные
// Выведите целое число, которое нужно добавить в массив, чтобы все числа массива разбивались на пары с нулевой суммой. Гарантируется, что такое число существует.
//
// Система оценки
// В этой задаче две группы тестов.
//
// Первая группа тестов стоит 6 баллов, для неё выполняется ограничение n≤999.
// Вторая группа тестов стоит 4 балла, для неё выполняется ограничение n≤99999.

// входные данные: 7 1 -2 1 2 3 -1 -1
// выходные данные: -3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class MissingNumber2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(reader.readLine());

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] + array[array.length-1-i] != 0) {
                if (Math.abs(array[i]) > Math.abs(array[array.length-1-i])) {
                    System.out.println(-array[i]);
                    break;
                }
                else System.out.println(-array[array.length-1-i]);
                break;
            }
        }
    }
}
