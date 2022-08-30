package LeetCode;

//Medium

//You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
//You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

//Вам дана двумерная матрица n x n, представляющая изображение, поверните изображение на 90 градусов (по часовой стрелке).
//Вам нужно повернуть изображение на месте, что означает, что вы должны напрямую изменить входную 2D-матрицу. НЕ выделяйте другую 2D-матрицу и не выполняйте поворот.

public class I48RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        rotate(matrix);
    }
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < (n + 1) / 2; i ++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
                matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 -i];
                matrix[j][n - 1 - i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
}
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate Image.