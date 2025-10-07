import java.util.Scanner;

public class TwoD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n=sc.nextInt();
        System.out.print("Enter number of columns:");
        int m=sc.nextInt();
        int mat[][]=new int[n][m];
        int s=n*m;
        //INPUT
        System.out.print("Enter "+s+" numbers:");
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=m-1;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        //OUTPUT
        System.out.println("The "+n+"x"+m+" matrix is:");
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=m-1;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        //SUM OF MATRIX ELEMENTS
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum=sum+mat[i][j];
            }
        }
        System.out.println("The sum of the matrix is:"+sum);
        //Row-Wise sum
        for(int i=0;i<n;i++){
            int r_sum=0;
            for(int j=0;j<m;j++){
                r_sum=r_sum+mat[i][j];
            }
            System.out.println("Sum of "+(i+1)+" row is "+r_sum);
        }
    }
}
