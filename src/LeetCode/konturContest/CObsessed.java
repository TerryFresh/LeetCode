package LeetCode.konturContest;

// ограничение по времени на тест 1.5 секунд
// ограничение по памяти на тест 256 мегабайт

// Игнат просто одержим интересными подотрезками массивов из целых неотрицательных чисел.
// Интересным подотрозеком массива [a1>an] он называет массив x (1<=l<=r<=N),
// в котором не более одного нулевого элемента, а сумма всех элементов не превосходит числа K.
// У Игната есть массив a длинны N. Найдите количество интересных подотрезков этого массива.
//
// Входные данные
// В первой строке содержаться целые числа N и K (1<=N<=10^5;0<=k<=10^9).
// Во второй строке содержаться целые числа a1...an(0<=ai<=10^9).
//
// Выходные данные
// Выведите количество интересных подотрезков массива.
//
// Система оценки
// Первая группа тестов стоит 3 балла, для неё выполняются ограничения N<=100;0<=ai<=10^5.
// Вторая группа тестов стоит 3 балла, для неё выполняются ограничения N<=2000;0<=ai<=10^9.
// Третья группа тестов стоит 2 балла, для неё выполняются ограничения N<=10^5;1<=ai<=10^9.
// Четвёртая группа тестов стоит 2 балла, для неё выполняются ограничения N<=10^5;0<=ai<=10^9.
//
// Примеры
// Входные данные
// 4 1
// 0 1 1 0
// Выходные данные
// 6
//
// Входные данные
// 4 4
// 1 2 3 4
// Выходные данные
// 5
//
// В первом примере интересными являются четыре одноэлементарных подотрезка, а также подотрезки [0,1] и [1,0].
// Во втором примере интересными являются четыре одноэлементарных подотрезка, а также подотрезок [1,2].


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CObsessed {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstInput = reader.readLine().split(" ");
        String[] secondInput = reader.readLine().split(" ");
        int n = Integer.parseInt(firstInput[0]);
        int k = Integer.parseInt(firstInput[1]);
        int[] numbers = new int[n];
        int resultCount = 0;

//        int n = 4;
//        int k = 1;
//        int[] numbers = new int[]{0,1,1,0};  //6

//        int n = 4;
//        int k = 4;
//        int[] numbers = new int[]{1,2,3,4};  //5

//        int n = 10;
//        int k = 5;
//        int[] numbers = new int[]{0,1,0,1,0,0,0,0,0,0};

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(secondInput[i]);
        }

        for (int i = 0; i < n; i++) {
            if (numbers[i] <= k){
                resultCount++;
            }
        }

        boolean zero = true;
        for (int i = 0; i < numbers.length; i++) {
            zero = true;
            int sum = 0;
            if (numbers[i] == 0) {
                zero = false;
            }
            for (int j = 1+i; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] + sum <= k) {
                    if (numbers[j] == 0 && zero == false){
                        break;
                    }
                    if (numbers[j] == 0) {
                        zero = false;
                    }
                    resultCount++;
                }
                sum += numbers[j];
            }
        }
        System.out.println(resultCount);
    }
}
