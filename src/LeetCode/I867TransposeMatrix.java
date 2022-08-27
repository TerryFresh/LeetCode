package LeetCode;

//Easy

//Given a 2D integer array matrix, return the transpose of matrix.
//The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

//Учитывая матрицу двумерного целочисленного массива, вернуть транспонированную матрицу.
//Транспонированием матрицы называется переворачивание матрицы по главной диагонали, в результате чего индексы строк и столбцов матрицы меняются местами.

public class I867TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3}, //1 4 7
                {4, 5, 6}, //2 5 8
                {7, 8, 9}};//3 6 9
        System.out.println(transpose(matrix));
    }

    public static int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Transpose Matrix.