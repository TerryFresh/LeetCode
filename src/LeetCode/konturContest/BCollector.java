package LeetCode.konturContest;

// ограничение по времени на тест 1 секунда
// ограничение по памяти на тест 256 мегабайт

// Игнат увлекается коллекционированием настенных ковров. Недавно он смог освободить стену комнаты
// и теперь хочет повесить на эту стену ковер наибольшей возможной площади.
// В стену вбито N гвоздей. Ковер можно вешать только параллельно осям координат, на четыре гвоздя,
// расположенных по углам ковра. Другие гвозди на стене разрешается накрывать ковром.
//
// Найдите максимальную площадь ковра, который можно повесить на эту стену.
//
// Входные данные
// В первой строке содержится целое число N - количество забитых гвоздей в стене (4<=N<=1500).
// В каждой из следующих N строк содержатся целые числа x и y - координаты i-го гвоздя (-10^9<=x,y<=10^9).
// Гарантируется, что никакие два гвоздя не расположены в одной точке.
//
// Выходные данные
// Выведите максимальную площадь ковра, которой можно разместить на стене. Если на стене невозможно разместить
// ни одного ковра, выведите 0. Обратите внимание, что ответ задачи может не помещаться в 32-битный целый тип данных!
//
// Система оценки
// В этой задачи 3 группы тестов.
// Первая группа тестов стоит 4 балла, для нее выполняется ограничение N<=30
// Вторая группа тестов стоит 3 балла, для нее выполняется ограничение N<=300
// Третья группа тестов стоит 3 балла, для нее выполняется ограничение N<=1500
//
// Примеры
// Входные данные
// 8
// 0 0 - 1 1 - 0 2 - 5 0 - 5 2 - 0 4 - 3 0 - 3 4
// Выходные данные
// 12
//
// В первом тесте можно повесить ковер с площадью 12 на гвозди с координатами (0,0), (3,0), (0,4), (3,4)
// либо ковер с площадью 10 на гвозди с координатами (0,0), (5,0), (0,2), (5,2).

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BCollector {
    public static void main(String[] args) throws Exception {

//        long m = System.currentTimeMillis();
//        long usedBytes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
//        int n = 8;

//        String[][] numbers = {
//                {"0", null, "2", null, "4", null, null, null},
//                {null, "1", null, null, null, null, null, null},
//                {null, null, null, null, null, null, null, null},
//                {"0", null, null, null, "4", null, null, null},
//                {null, null, null, null, null, null, null, null},
//                {"0", null, "2", null, null, null, null, null},
//                {null, null, null, null, null, null, null, null},
//                {null, null, null, null, null, null, null, null}};
//
//        String[][] numbers = {
//                {null,null,null,null,null,null,null,null},
//                {null,"1",null,null,"4",null,null,null},
//                {null,null,"2",null,null,null,"6",null},
//                {null,"1",null,null,"4",null,null,null},
//                {null,null,null,null,null,null,null,null},
//                {null,null,null,null,null,null,null,null},
//                {null,null,null,null,null,null,null,null},
//                {null,null,"2",null,null,null,"6",null}};

        String[][] numbers = new String[n][n];

        for (int i = 0; i < n; i++) {
            String input = reader.readLine();
            String[] splitInput = input.split(" ");
            numbers[Integer.parseInt(splitInput[0])][Integer.parseInt(splitInput[1])] = splitInput[1];
        }

        int leftUp = 0;
        int rightUp = 0;
        long s = 0;
        long result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (numbers[i][j] != null) {
                    leftUp = Integer.parseInt(numbers[i][j]);
                    break;
                }
            }
            for (int j = n - 1; j >= 0; j--) {
                if (numbers[i][j] != null) {
                    rightUp = Integer.parseInt(numbers[i][j]);
                    break;
                }
            }
            for (int j = 1 + i; j < n; j++) {
                if (numbers[j][leftUp] != null && numbers[j][rightUp] != null) {
                    if (Integer.parseInt(numbers[j][leftUp]) == leftUp && Integer.parseInt(numbers[j][rightUp]) == rightUp) {
                        s = (long) (j - i) * (rightUp - leftUp);
                        if (s > result) {
                            result = s;
                        }
                    }
                }
            }
        }
        System.out.println(result);

//        System.out.println((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1048576 + "MB");
//        System.out.println((double) (System.currentTimeMillis() - m) + " Ms");
    }
}


