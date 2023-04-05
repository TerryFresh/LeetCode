package LeetCode.konturContest;

// ограничение по времени на тест 2 секунд
// ограничение по памяти на тест 256 мегабайт
//
// Игнат позиционирует себя как общительный человек, поэтому у него много друзей.
// Недавно игнат и его друзья придумали новый способ генерации случайных чисел.
// Способ заключается в том что каждый из N друзей Игната берет кубик и записывает на всех его гранях какие то целые числа
// (не обязательно различные). После этого все друзья одновременно кидают свои кубики, а Игнат складывает все выпавшие в кубиках числа.
// Получившаяся сумма и будет случайным сгенерированным числом.
// Игнату интересно, сколько различных целых чисел он может получить таким способом.
//
// Входные данные
// В первой строке содержится целое число N - количество друзей Игната (3<=N<=100).
// В i-й из слудеющих N строк содержаться целые числа- числа записанные на гранях кубика i-го друга (0<=ai<=500).
//
// Выходные данные
// Выведите количество различных целых чисел, которые могут быть получены с помощью описанного способа генерации случайных чисел.
//
// Система оценки
// В этой задаче 3 группы тестов.
// Первая группа тестов стоит 4 балла, для нее выполняется ограничение N = 3.
// Первая группа тестов стоит 3 балла, для нее выполняется ограничение N <= 9.
// Первая группа тестов стоит 3 балла, для нее выполняется ограничение N <= 100.
//
// Пример
// Входные данные
// 3
// 0 1 2 3 4 5
// 0 0 2 3 4 5
// 3 4 5 0 0 0
// Выходные данные
// 16
//
// В примере описанным способом можно получить любое целое число от 0 до 15 включительно.


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DCommunicativePerson {
    public static void main(String[] args) throws IOException {
//        long m = System.currentTimeMillis();
//        long usedBytes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
//        int n = 4;
//        int n = 5;
//        int n = 15;
//        int[][] numbers = {{0,1,2,3,4,5},{0,0,2,3,4,5},{3,4,5,0,0,0}};        //16
//        int[][] numbers = {{0,2,3,4,5},{6,7,8,9,10,11},{12,13,14,15,16,17},{18,19,20,21,22,23},{100,200,300,400,500,214}};
//        int[][] numbers = {{1,0,0,0,0,5},{1,0,0,0,0,5},{1,0,0,0,0,5}};        //10    0 1 2 3 5 6 7 10 11 15
//        int[][] numbers = {{1,0,0,0,0,5},{1,0,0,0,0,5},{1,0,0,0,0,5},{1,0,0,0,0,5},{1,0,0,0,0,5}};        //20
//        int[][] numbers = {{0,0,0,0,1,5},{0,0,0,0,1,5},{0,0,0,0,1,5},{0,0,0,0,1,5},{0,0,0,0,1,5},{0,0,0,0,1,5},{0,0,0,0,1,5},
//                {19,20,21,22,23,24},{19,20,21,22,23,24},{19,20,21,22,23,24},{19,20,21,22,23,24},
//              {19,20,21,22,23,24},{19,20,21,22,23,24},{19,20,21,22,23,24},{19,20,21,22,23,24}
//        };

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[][] numbers = new int[n][6];
        for (int i = 0; i < n; i++) {
            String[] s = reader.readLine().split(" ");
            for (int j = 0; j < s.length; j++) {
                numbers[i][j] = Integer.parseInt(s[j]);
            }
        }
        for (int i = 0; i < numbers.length; i++) {
        numbers[i] = Arrays.stream(numbers[i]).distinct().toArray();
        }

        Set<Integer> set = new HashSet<>();

        allSums(numbers, 0, 0, set);

        System.out.println(set.size());

//        System.out.println((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1048576 + "MB");
//        System.out.println((double) (System.currentTimeMillis() - m) + " Ms");
    }

    public static void allSums(int[][] numbers, int index, int sum, Set<Integer> set) {
        if (index == numbers.length) {
            set.add(sum);
        } else {
            for (int i = 0; i < numbers[index].length; i++) {
                allSums(numbers, index + 1, sum + numbers[index][i], set);
            }
        }
    }
}
//for (int i = 0; i < numbers.length; i++) {
//        numbers[i] = Arrays.stream(numbers[i]).distinct().toArray();
//        }

//        for (int i = 0; i < 6; i++) {       // До n3-------------------------------
//            sum += array1[i];
//            for (int j = 0; j < 6; j++) {
//                sum+= array2[j];
//                for (int k = 0; k < 6; k++) {
//                    sum+= array3[k];
//                    set.add(sum);
//                    sum-= array3[k];
//                }
//                sum-= array2[j];
//            }
//            sum-= array1[i];
//        }