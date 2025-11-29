import java.util.Scanner;

public class DiagonalDiff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of row:");
        int n=sc.nextInt();
        System.out.print("Enter number of col:");
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        System.out.print("Enter array elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("The matrix is "+arr[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("sum:"+sum);
    }
}
