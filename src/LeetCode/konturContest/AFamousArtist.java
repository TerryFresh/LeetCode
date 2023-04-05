package LeetCode.konturContest;

// ограничение по времени на тест 1 секунда
// ограничение по памяти на тест 256 мегабайт

// Очень известный в определенных кругах художник Игнат рисовал каждый день по одной картине в течение N дней.
// В i-й день Игнат нарисовал картину с яркостью красок ai.

// Теперь Игнат хочет выбрать из N получившихся картин самую контрастную пару. Пара картин (i,j), нарисованных в дни i и j соответственно,
// называется самой контрастной, если значение ai - aj максимально среди возможных пар.

// Входные данные
// В первой строке содержится целое число N - количество дней (2<=N<=10^5). Во второй строке содержаться целые числа an
// где аi = яркость картины, нарисованной в i-й день (-10^9<=ai<=10^9).

// Выходные данные
// Выведите различные целые числа i и j - номера дней, в которые Игнат нарисовал самую контрастную пару картин (i,j).
// Числа i и j должны лежать в пределах от 1 до N. Если таких пар несколько, выведите пару с максимальным значением i-j.
// Обратите внимание, что пара (i,j) отличается от пары (j,i).

// Система оценки
// В этой задаче 2 группы тестов
// Первая группа тестов стоит 5 баллов, для нее выполняется ограничение N<=1000.
// Вторая группа тестов стоит 5 баллов, для нее выполняется ограничение N<=10^5.

// Примеры
// Входные данные
// 6
// 1 2 1 3 1 3
// Выходные данные
// 6 1

// Входные данные
// 4
// 2 1 0 -1
// Выходные данные
// 1 4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AFamousArtist {
    public static void main(String[] args) throws IOException {

//        int N = 4;
//        int[] arrayNumbers = new int[]{2, 1, 0, -1};

//        int N = 6;
//        int[] arrayNumbers = new int[]{1, 2, 1, 3, 1, 3};

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        String numbers = reader.readLine();
        String[] splitNumbers = numbers.split(" ");
        int[] arrayNumbers = new int[N];

        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = Integer.parseInt(splitNumbers[i]);
        }

        int min = arrayNumbers[0];
        int max = arrayNumbers[0];

        int resultMin = 1;
        int resultMax = 1;

        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] < min) {
                min = arrayNumbers[i];
                resultMin = i + 1;
            }
            if (arrayNumbers[i] >= max) {
                max = arrayNumbers[i];
                resultMax = i + 1;
            }
        }
        System.out.println(resultMax + " " + resultMin);
    }
}
