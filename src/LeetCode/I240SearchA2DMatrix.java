package LeetCode;

//Medium

//Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
//Integers in each row are sorted in ascending from left to right.
//Integers in each column are sorted in ascending from top to bottom.

//Напишите эффективный алгоритм, который ищет целевое значение в целочисленной матрице размера m x n. Эта матрица обладает следующими свойствами:
//Целые числа в каждой строке сортируются по возрастанию слева направо.
//Целые числа в каждом столбце сортируются по возрастанию сверху вниз.

public class I240SearchA2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 5;

        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean result = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    result = true;
                }
            }
        }
        return result;
    }
}
//Runtime: 13 ms, faster than 33.20% of Java online submissions for Search a 2D Matrix II.

