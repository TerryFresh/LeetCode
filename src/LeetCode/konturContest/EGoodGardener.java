package LeetCode.konturContest;

// ограничение по времени на тест 2 секунд
// ограничение по памяти на тест 256 мегабайт

// В деревне у Игната есть огород. План огорода представляет из себя клеточное поле из N строк и M столбцов.
// Строки нумеруются от 1 до N сверху вниз, а столбцы нумеруются от 1 до M слева направо.
// Игнат на время уезжал в город, и за время его отсутствия огород зарос сорняками.
// Теперь огород можно описать матрицей N на M из целых неотрицательных чисел обозначающих высоту сорняков в текуще клетке.
// Игнат хочет привести огород в порядок. Но так как он человек занятой, у него хватит времени только на то,
// что бы прополоть ровно одну строку и ровно один столбец на плане огорода. После того как игнат пропалывает одну клетку,
// высота сорняков в этой клетке становится равной нулю.
// Игнат ввел понятие запущенности огорода. Так он называет максимальную высоту сорняков среди всех клеток огорода.
// Теперь Игнат хочет выбрать строку и столбец, которые нужно прополоть, что бы запущенность огорода стала как можно меньше.
// Найдите такие строку и столбец.
//
// Входные данные
// В первой строке содержатся целые числа N и M (2<=N,M<=1400).
// В каждой из следующих N строк содержаться по M цифр от 0 до 9 без пробелов - высота сорняков в соответствующих клетках огорода.
//
// Выходные данные
// Выведите номер строки и номер столбца, которые нужно прополоть, что бы запущенность огорода стала минимально возможной.
// Если подходящих ответов несколько, выведите любой из них.
//
// Система оценки
// Первая группа тестов стоит 4 балла, для нее выполняется ограничение N<=30
// Вторая группа тестов стоит 3 балла, для нее выполняется ограничение N<=300
// Третья группа тестов стоит 3 балла, для нее выполняется ограничение N<=1400
//
// Пример
// Входные данные
// 5 4
// 4412
// 3212
// 0121
// 2192
// 4103
//Выходные данные
// 1 3
//
// В примере есть несколько способов добиться минимальной запущенности огорода (она равна 4).
// Например, другой способ, кроме приведённого в примере - прополоть четвертую строку и первый столбец.
// Любой ответ, приводящий к запущенности 4, является правильным.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;







public class EGoodGardener {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = reader.readLine().split(" ");
        int N = Integer.parseInt(nm[0]);
        int M = Integer.parseInt(nm[1]);
        int[][] numbers = new int[N][M];

        for (int i = 0; i < N; i++) {
            String[] s = reader.readLine().split("");
            for (int j = 0; j < s.length; j++) {
                numbers[i][j] = Integer.parseInt(s[j]);
            }
        }

//        int N = 5;
//        int M = 4;
//        int[][] numbers = { {4,4,1,2},
//                            {3,2,1,2},
//                            {0,1,2,1},
//                            {2,1,9,2},
//                            {4,1,0,3}};

//        int N = 5;
//        int M = 4;
//        int[][] numbers = {     {2,1,1,1},
//                                {6,6,6,6},
//                                {0,0,0,0},
//                                {2,2,2,2},
//                                {1,1,1,9}};

        int[][] copyNumbers = copy(numbers);

        int stringMaxValue = 0;
        int columnMaxValue = 0;
        int resultString = 0;
        int resultColumn = 0;
        for (int i = 0; i < N; i++) {
            int[] sort = new int[M];
            sort = numbers[i];
            Arrays.sort(sort);
            StringBuilder sb = new StringBuilder("");
            for (int j = M-1; j >= 0; j--) {
                sb.append(sort[j]);
            }
            if (Integer.parseInt(String.valueOf(sb)) > stringMaxValue ) {
                stringMaxValue = Integer.parseInt(String.valueOf(sb));
                resultString = i+1;
            }
        }

        for (int i = 0; i < M; i++) {
            copyNumbers[resultString-1][i] = 0;
        }

        for (int i = 0; i < M; i++) {
            int[] sort = new int[N];
            StringBuilder sb = new StringBuilder("");
            for (int j = 0; j < N; j++) {
                sort[j] = copyNumbers[j][i];
            }
            Arrays.sort(sort);
            for (int j = N-1; j >= 0; j--) {
                sb.append(sort[j]);
            }
            if (Integer.parseInt(String.valueOf(sb)) > columnMaxValue ) {
                columnMaxValue = Integer.parseInt(String.valueOf(sb));
                resultColumn = i+1;
            }
        }
        System.out.println(resultString + " " + resultColumn);
    }

    public static int[][] copy(int[][] numbers) {
        if (numbers == null) {
            return null;
        }
        return Arrays.stream(numbers).map(int[]::clone).toArray(int[][]::new);
    }
}
