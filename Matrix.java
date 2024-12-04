import java.util.Scanner;

public class Matrix {
    
    public static int[][] addMatrices(int[][] mat1, int[][] mat2) {

        System.out.println("");
        int rows = mat1.length;
        int cols = mat1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] mat1, int[][] mat2) {
        System.out.println("");
        int rows = mat1.length;
        int cols = mat1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] - mat2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {

        System.out.println("");
        int rows1 = mat1.length;
        int cols1 = mat1[0].length;
        int rows2 = mat2.length;
        int cols2 = mat2[0].length;

        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible with given dimensions.");
        }

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of rows for Matrix:");
        int rows = s.nextInt();
        System.out.print("Enter the number of columns for Matrix:");
        int cols = s.nextInt();

        int[][] mat1 = new int[rows][cols];
        int[][] mat2 = new int[rows][cols];

        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat1[i][j] = s.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat2[i][j] = s.nextInt();
            }
        }

        int[][] sum = addMatrices(mat1, mat2);
        System.out.println("Addition of Matrix:");
        printMatrix(sum);

        int[][] difference = subtractMatrices(mat1, mat2);
        System.out.println("Subtraction of Matrix:");
        printMatrix(difference);

        try {
            int[][] product = multiplyMatrices(mat1, mat2);
            System.out.println("Multiplication of Matrix is:");
            printMatrix(product);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        s.close();
    }
}