import java.util.Scanner;

public class PalindromicPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter n:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //descending order
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //ascending order
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
