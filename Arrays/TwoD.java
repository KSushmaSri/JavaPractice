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
        
    }
}
