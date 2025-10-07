import java.util.Scanner;

public class TwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n = sc.nextInt();
        System.out.print("Enter number of columns:");
        int m = sc.nextInt();
        int mat[][] = new int[n][m];
        int s = n * m;
        // INPUT
        System.out.print("Enter " + s + " numbers:");
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= m - 1; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        // OUTPUT
        System.out.println("The " + n + "x" + m + " matrix is:");
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= m - 1; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        // SUM OF MATRIX ELEMENTS
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum = sum + mat[i][j];
            }
        }
        System.out.println("The sum of the matrix is:" + sum);
        // Row-Wise sum
        System.out.println("|Sum of each Row|");
        for (int i = 0; i < n; i++) {
            int r_sum = 0;
            for (int j = 0; j < m; j++) {
                r_sum = r_sum + mat[i][j];
            }
            System.out.println("   Sum of Row " + (i + 1) + " is " + r_sum);
        }
        // Column Wise Sum
        System.out.println("|Sum of Each Column|");
        for (int j = 0; j < m; j++) {
            int c_sum = 0;
            for (int i = 0; i < n; i++) {
                c_sum += mat[i][j];
            }
            System.out.println("   Sum of Column " + (j + 1) + " is " + c_sum);
        }
        // Max and Min
        int max = mat[0][0];
        int min = mat[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] > max) {
                    max = mat[i][j];
                }
                if (mat[i][j] < min) {
                    min = mat[i][j];
                }
            }
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
        // Transpose
        int transpose[][] = new int[m][n]; // swapped row and col
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[j][i] = mat[i][j];
            }
        }
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
