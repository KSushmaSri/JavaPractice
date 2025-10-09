import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // first matrix
        System.out.println("Enter size of rows and columns for matrix 1: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mat1[][] = new int[n][m];
        System.out.print("Enter " + (n * m) + " numbers:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }
        // second matrix
        System.out.println("Enter size of rows and columns for matrix 2: ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int mat2[][] = new int[p][q];
        System.out.print("Enter " + (p * q) + " numbers:");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }
        // Result Matrix
        int result[][] = new int[n][q];
        if (m != p) {
            System.out.println("Matrix Multiplication is not possible");
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < q; j++) {
                    result[i][j] = 0;
                    for (int k = 0; k < m; k++) {
                        result[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }
            System.out.println("Result: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
